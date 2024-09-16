
package DAO;

import DTO.ExecucaoDeServicoDTO;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExecucaoDeServicoDAO {
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   List<ExecucaoDeServicoDTO> lista = new ArrayList<>();
   
   
   public void CadastrarExecucao (ExecucaoDeServicoDTO execucaodeServicoDTO) throws ClassNotFoundException {
       // Consulta para verificar a existência da OS na tabela OBRAS
        String verificaOSsql = "SELECT OS FROM OBRAS WHERE OS = ?";

      
        try {
            conn = new ConexaoBD().conectaBD();

            // Verificar se a OS existe na tabela OBRAS
            pstm = conn.prepareStatement(verificaOSsql);
            pstm.setString(1, execucaodeServicoDTO.getOS());
            rs = pstm.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "OS não encontrada na tabela OBRAS.");
                return; // Se a OS não existe, não faz mais nada
            }
                 else {
                // Inserir novo registro na tabela EXECUCAOOBRAS
                String insertsql = "INSERT INTO EXECUCAOOBRAS (OS, N_medicao, NomeMaterial, CodigoMaterial, QuantidadeMaterial, UnidadeMedMaterial, Data, Valor, Subtotal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                pstm = conn.prepareStatement(insertsql);
                pstm.setString(1, execucaodeServicoDTO.getOS());
                pstm.setString(3, execucaodeServicoDTO.getN_medicao());
                pstm.setString(4, execucaodeServicoDTO.getNomeMaterial());
                pstm.setString(5, execucaodeServicoDTO.getCodigoMaterial());
                pstm.setString(6, execucaodeServicoDTO.getQuantidadeMaterial());
                pstm.setString(7, execucaodeServicoDTO.getUnidadeMedMaterial());
                pstm.setString(8, execucaodeServicoDTO.getData());
                pstm.setString(9, execucaodeServicoDTO.getValor());
                pstm.setString(10, execucaodeServicoDTO.getSubtotal());

                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ExecucaoObras: " + e.getMessage());
        } finally {
            // Fechar conexões e recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
    
    public void exportarParaPlanilha(List<ExecucaoDeServicoDTO> listar, String filePath) {
    try (Workbook workbook = new XSSFWorkbook()) {
        Sheet sheet = workbook.createSheet("Dados"); // Cria uma nova planilha com o nome "Dados"

        int rowIndex = 0;
        Row headerRow = sheet.createRow(rowIndex++);

        // Define o cabeçalho das colunas da planilha
        headerRow.createCell(0).setCellValue("END");
        headerRow.createCell(1).setCellValue("Local");
        headerRow.createCell(2).setCellValue("Tipo");
        headerRow.createCell(3).setCellValue("OS");
        headerRow.createCell(4).setCellValue("n° medição");
        headerRow.createCell(5).setCellValue("Nome Item");
        headerRow.createCell(6).setCellValue("Código Item");
        headerRow.createCell(7).setCellValue("Quantidade");
        headerRow.createCell(8).setCellValue("Unidade Medida");
        headerRow.createCell(9).setCellValue("Data");
        headerRow.createCell(10).setCellValue("Valor");
        headerRow.createCell(11).setCellValue("Subtotal");

        // Preenche os dados na planilha a partir da lista de DTOs
    for (ExecucaoDeServicoDTO dto : listar) {
                Row dataRow = sheet.createRow(rowIndex++);
                dataRow.createCell(0).setCellValue(dto.getEndereço());
                dataRow.createCell(1).setCellValue(dto.getLocalObra() );
                dataRow.createCell(2).setCellValue(dto.getTipo() );
                dataRow.createCell(3).setCellValue(dto.getOS() );
                dataRow.createCell(4).setCellValue(dto.getN_medicao() );
                dataRow.createCell(5).setCellValue(dto.getNomeMaterial() );
                dataRow.createCell(6).setCellValue(dto.getCodigoMaterial() );
                dataRow.createCell(7).setCellValue(dto.getQuantidadeMaterial() );
                dataRow.createCell(8).setCellValue(dto.getUnidadeMedMaterial());
                dataRow.createCell(9).setCellValue(dto.getData());
                dataRow.createCell(10).setCellValue(dto.getValor());
                dataRow.createCell(11).setCellValue(dto.getSubtotal());
            }

        // Mensagem que avisa onde a planilha está/ Salva a mesma
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
            System.out.println("Planilha exportada com sucesso para: " + filePath);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
  public List<ExecucaoDeServicoDTO> ListarMedicoes(String Endereco,String OS) throws ClassNotFoundException {
    List<ExecucaoDeServicoDTO> lista = new ArrayList<>();
    conn = new ConexaoBD().conectaBD();
    
     try {
        // Consulta básica
        String sql = "SELECT o.endereço, o.LocalObra, o.Tipo , ex.* FROM Execucaoobras ex INNER JOIN Obras o ON ex.OS = o.OS ";
        
        // Adiciona a condição WHERE se Endereco não estiver vazio
        if (Endereco != null && !Endereco.trim().isEmpty()) {
            sql += " AND o.LocalObra LIKE ?"; // Usa WHERE para a condição inicial
        }
        
        if (OS != null && !OS.trim().isEmpty()){
            sql+= " AND o.OS LIKE ?";
        }
        
        // Prepara o statement
        pstm = conn.prepareStatement(sql);
        
         int index = 1;
        // Adiciona o parâmetro se OS não estiver vazio
         if (!Endereco.isEmpty()) {
        pstm.setString(index++, "%" + Endereco + "%");
        }
        
        if (!OS.isEmpty()) {
            pstm.setString(index++, "%" + OS + "%"); // Adiciona o valor 
        }
        
        rs = pstm.executeQuery();
        
        while (rs.next()) {
            ExecucaoDeServicoDTO dto = new ExecucaoDeServicoDTO();
            dto.setEndereço(rs.getString("endereço"));
            dto.setLocalObra(rs.getString("LocalObra"));
            dto.setTipo(rs.getString("Tipo"));
            dto.setOS(rs.getString("OS"));
            dto.setN_medicao(rs.getString("N_medicao"));
            dto.setNomeMaterial(rs.getString("NomeMaterial"));
            dto.setCodigoMaterial(rs.getString("CodigoMaterial"));
            dto.setQuantidadeMaterial(rs.getString("QuantidadeMaterial"));
            dto.setUnidadeMedMaterial(rs.getString("UnidadeMedMaterial"));
            dto.setData(rs.getString("Data"));
            dto.setValor(rs.getString("Valor"));
            dto.setSubtotal(rs.getString("Subtotal"));
            lista.add(dto);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar dados: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
        }
    }
    return lista;
}
}

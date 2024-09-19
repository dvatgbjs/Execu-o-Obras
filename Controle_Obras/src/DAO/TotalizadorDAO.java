/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ExecucaoDeServicoDTO;
import VIEW.TelaTotalizadorView;
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

/**
 *
 * @author jateixeira
 */
public class TotalizadorDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    List<ExecucaoDeServicoDTO> lista = new ArrayList<>();
   
    
    public List<ExecucaoDeServicoDTO> ListarTotalizador(String N_Medicao) throws ClassNotFoundException{
         
         conn = new ConexaoBD().conectaBD();
        
        try{
            
            String sql = "SELECT OS, N_Medicao, NomeMaterial, QuantidadeMaterial, Subtotal from execucaoobras";
            
            if(N_Medicao != null && !N_Medicao.trim().isEmpty()){
                sql += " WHERE N_Medicao LIKE ?";
            }
            pstm = conn.prepareStatement(sql);
            
             int index = 1;
             
             if (!N_Medicao.isEmpty()){
                 
                 pstm.setString(index++, "%" + N_Medicao + "%");
             }
             
            rs = pstm.executeQuery();
            
            while (rs.next()){
                ExecucaoDeServicoDTO dto = new ExecucaoDeServicoDTO();
                    dto.setOS(rs.getString("OS"));
                    dto.setN_medicao(rs.getString("N_Medicao"));
                    dto.setNomeMaterial(rs.getString("NomeMaterial"));
                    dto.setQuantidadeMaterial(rs.getString("QuantidadeMaterial"));
                    dto.setSubtotal(rs.getString("Subtotal"));
                    
                    lista.add(dto);
            }
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar dados: " + e.getMessage());
        } finally{
            try{
                if(rs != null) rs.close();
                if(pstm != null) pstm.close();
                if(conn != null && !conn.isClosed()) conn.close();
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return lista;
    } 
     public void exportarTotalizadores(List<ExecucaoDeServicoDTO> listar, String filePath) {
          
         
        
    
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import DTO.MateriaisDTO;
import java.sql.SQLException;
import java.sql.Connection;

public class CadastroMateriaisDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastroMateriais(MateriaisDTO objmateriaisDto) throws ClassNotFoundException{
        String sql = "insert into ProjetoObras.Materiais (CódigoItem, NomeItem, ValorItem, UniMedida) values (?, ?, ?, ?)";
        
        conn = new ConexaoBD().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objmateriaisDto.getCódigoItem());
            pstm.setString(2, objmateriaisDto.getNomeItem());
            pstm.setDouble(3, objmateriaisDto.getValorItem());
            pstm.setString(4, objmateriaisDto.getUniMedida());
            
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!!!");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastroMateriaisDAO" + erro);
        }
    }
}

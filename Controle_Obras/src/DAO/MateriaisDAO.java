/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import DTO.MateriaisDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MateriaisDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    List<MateriaisDTO> lista = new ArrayList<>();
        
        public List<MateriaisDTO> consultarMateriais (String CódigoItem, String NomeItem, String ValorItem, String UniMedida) throws ClassNotFoundException, SQLException{
            
        conn = new ConexaoBD().conectaBD();
        
        try{
            String sql = "Select * from projetoobras.Materiais";
            
            pstm = conn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
            MateriaisDTO materiaisDto = new MateriaisDTO();
            
            materiaisDto.setCódigoItem(rs.getString("CódigoItem"));
            materiaisDto.setNomeItem(rs.getString("NomeItem"));
            materiaisDto.setValorItem(rs.getString("ValorItem"));
            materiaisDto.setUniMedida(rs.getString("UniMedida"));
            
            lista.add(materiaisDto);
            }
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "MateriaisDAO" + erro);
        } return lista;
        } 
    
}

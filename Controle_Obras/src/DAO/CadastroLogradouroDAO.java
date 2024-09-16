/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import DTO.CadastroLogradouroDTO;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class CadastroLogradouroDAO {
        Connection conn;
        PreparedStatement pstm;
        
        public void cadastroLogradouro(CadastroLogradouroDTO objLogradouroDto) throws ClassNotFoundException{
                
                conn = new ConexaoBD().conectaBD();
                try{
                   String sql = "insert into projetoobras.logradouros (Nome, Tipo, Bairro) values (?, ?, ?)";
                   
                   pstm = conn.prepareStatement(sql);
                   
                   pstm.setString(1, objLogradouroDto.getNome());
                   pstm.setString(2, objLogradouroDto.getTipo());
                   pstm.setString(3, objLogradouroDto.getBairro());
                   
                   pstm.execute();
                   
                   JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!!!");
                    
                    
                } catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "CadastroLogradouroDAO" + erro);
                }
        }
}

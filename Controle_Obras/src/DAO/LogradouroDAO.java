/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.SQLException;
import DTO.CadastroLogradouroDTO;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LogradouroDAO {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        
        
        List<CadastroLogradouroDTO> lista = new ArrayList<>();
            
                public List <CadastroLogradouroDTO> consultarLogradouros (String Nome, String Tipo, String Bairro) throws ClassNotFoundException{
                
                conn = new ConexaoBD().conectaBD();
                
                try {
                    
                    String sql = "Select * from logradouros";
                            
                    pstm = conn.prepareStatement(sql);
                    rs = pstm.executeQuery();
                    while(rs.next()){
                        
                        CadastroLogradouroDTO logradouroDto = new CadastroLogradouroDTO();
                        
                        logradouroDto.setNome(rs.getString("Nome"));
                        logradouroDto.setTipo(rs.getString("Tipo"));
                        logradouroDto.setBairro(rs.getString("Bairro"));
                        
                        lista.add(logradouroDto);
                        
                        
                    }
                } catch(SQLException erro){
                        JOptionPane.showMessageDialog(null, "LogradouroDAO" + erro);
                    }return lista;
        } 

    public List<CadastroLogradouroDTO> consultarLogradouro(String Nome, String Tipo, String Bairro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }


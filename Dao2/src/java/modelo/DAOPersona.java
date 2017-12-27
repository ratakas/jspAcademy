/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;
import java.sql.*;
import uml.Persona;


/**
 *
 * @author root
 */
public class DAOPersona implements Operaciones{
    Database db = new Database();
    
    @Override
    public String crear(Object obj) {
        Persona p= (Persona) obj;
        Connection conn;
        PreparedStatement pst;
        String sql="insert into persona values(?,?,?,?)";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            conn= DriverManager.getConnection(
            db.getUrl(),
            db.getUsuario(),
            db.getPassword()
            );
                    
        } catch (Exception e) {
        }
        
        
        return "";
    }
    @Override
    public String eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> filtrar(String campo, String Criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

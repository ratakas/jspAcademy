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
            pst=conn.prepareStatement(sql);
            pst.setInt(1, p.getId());
            pst.setString(2, p.getNombre());
            pst.setString(3, p.getApellido());
            pst.setInt(4, p.getEdad());
            int filas=pst.executeUpdate();
            respuesta="se registraro "+filas+" nuevo elemetos";
            conn.close();
            
                    
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        
        
        return respuesta;
    }
    @Override
    public String eliminar(Object obj) {
           Persona p= (Persona) obj;
        Connection conn;
        PreparedStatement pst;
        String sql="delete from persona where id=?";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            conn= DriverManager.getConnection(
            db.getUrl(),
            db.getUsuario(),
            db.getPassword()
            );
            pst=conn.prepareStatement(sql);
            pst.setInt(1, p.getId());
            int filas=pst.executeUpdate();
            respuesta="se elimino "+filas+" nuevo elemetos";
            conn.close();
            
                    
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        
        
        return respuesta; 
    
    }

    @Override
    public String editar(Object obj) {
         Persona p= (Persona) obj;
        Connection conn;
        PreparedStatement pst;
        String sql="pdate persona set nombre=?, apellido=?, edad=? where id=?";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            conn= DriverManager.getConnection(
            db.getUrl(),
            db.getUsuario(),
            db.getPassword()
            );
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getApellido());
            pst.setInt(3, p.getEdad());
            pst.setInt(4, p.getId());
            int filas=pst.executeUpdate();
            respuesta="se edito "+filas+" nuevo elemetos";
            conn.close();
            
                    
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        
        
        return respuesta;
    }

    @Override
    public List<Persona> consultar() {
        
        List<Persona> datos = new ArrayList();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql= "select * from persona";
        try {
            Class.forName(db.getDriver());
            conn=DriverManager.getConnection(
            db.getUrl(),db.getUsuario(),db.getPassword()
            );
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                datos.add(new Persona(rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad")
                    ));

            }
            conn.close();
            
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        return datos;
    }

    @Override
    public List<?> filtrar(String campo, String Criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

package modelo;

import beans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao implements IUsuario{

    @Override
    public void add(Usuario usuario, Connection con) throws Exception {
        StringBuffer sql= new StringBuffer();
        sql.append("insert into usuario (nombre,apellido,edad,user,pass) "+
                "values(?,?,?,?)");
        PreparedStatement pStmt= con.prepareStatement(sql.toString());
        pStmt.setString(1, usuario.getNombre() );
        pStmt.setString(2, usuario.getApellido());
        pStmt.setString(3, usuario.getUser());
        pStmt.setString(4, usuario.getPass());
        pStmt.execute();
        pStmt.close();
    }

    @Override
    public List<Usuario> select(Connection con) throws Exception {
        List<Usuario> lista= new ArrayList<>();
        StringBuffer sql= new StringBuffer();
        sql.append("select * from usuario");
        PreparedStatement pStmt= con.prepareStatement(sql.toString());
        ResultSet rs= pStmt.executeQuery();
        while(rs.next()){
                lista.add(new Usuario(rs.getInt("codigo"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad")
                    ));

            }
        rs.close();
        pStmt.close();
        return lista;   
    }
    
}

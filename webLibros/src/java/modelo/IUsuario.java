package modelo;

import beans.Usuario;
import java.sql.Connection;
import java.util.List;

public interface IUsuario {
    public void add(Usuario usuario,Connection con) throws Exception;
    public List<Usuario> select(Connection con) throws Exception;

    
}

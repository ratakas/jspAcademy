
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  private static Conexion connection=null;
  
  public Conexion(){
      
      
  }
  public static Conexion getInst(){
      if (connection == null) {
          connection= new Conexion();
          
      }
    return connection;          
  }
  public Connection getConexion(String user, String pass) throws ClassNotFoundException, SQLException{
    String url = "jdbc:mysql://localhost:3306/tutorial";
    Class.forName("com.mysql.jdbc.Driver");
    
    return DriverManager.getConnection(url, user, pass);
  }
      
}


package testConexion;

import java.sql.Connection;
import conexion.Conexion;
public class testConexion {

    public static void main(String[] args) throws Exception {
       Connection con =null;
        try {
            con= Conexion.getInst().getConexion("root", "");

            System.out.println("conexio abirta");
            
        } catch (Exception e) {
        }finally{
            if (con != null) {
                con.close();
                System.out.println("conexion terminada");
            }
        }
    }
    
}

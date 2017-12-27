
package modelo;
public class Database {
   private String driver;
   private String url; 
   private String usuario; 
   private String password; 

    public Database() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/tutorial";
        this.usuario = "root";
        this.password = "";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
   
   

}

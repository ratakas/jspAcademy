/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author ratakas
 */
public class Usuario {
   private int codigo;
   private String nombre;
   private String apellido;
   private int edad;
   private String user;
   private String pass;

   public Usuario(){}

    public Usuario(String nombre, String apellido, int edad, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
    }

    public Usuario(int codigo, String nombre, String apellido, int edad, String user, String pass) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
    }
    //listar
    public Usuario(int codigo, String nombre, String apellido, int edad) {
     this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;   
    }
   
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
}  

    
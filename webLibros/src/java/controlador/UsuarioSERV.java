package controlador;
import beans.Usuario;
import conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.UsuarioDao;

public class UsuarioSERV extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        int edad= Integer.parseInt(request.getParameter("edad"));
        String user= request.getParameter("user");
        String pass= request.getParameter("pass");
        
        Connection con= null;
        try {
            con= Conexion.getInst().getConexion("root", "");
            
            Usuario U = new Usuario(nombre,apellido,edad,user,pass);
            UsuarioDao dao=new UsuarioDao();
            dao.add(U,con);
            
        } catch (Exception e) {
        }
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

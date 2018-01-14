<%@page import="modelo.DAOPersona"%>
<%@page import="java.util.*" %>
<%@page import="uml.Persona" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>vista persona</title>
    
    </head>
    <body>
        <%
            DAOPersona dao= new DAOPersona();
            List<Persona> datos= new ArrayList();
        %>
        <h1>Formulario</h1>
        <form action="SERVPersona" name="formPersona" method="POST">
            id de persona : <input type="text" name="txtId"> <br>
            Nombres : <input type="text" name="txtNombre"> <br>
            apellidos : <input type="text" name="txtApellido"> <br>
            edad : <input type="text" name="txtEdad"> <br>

            <input type="submit" name="btnInsertar" value="insertar">
            <input type="submit" name="btnModificar" value="modificar">
            <input type="submit" name="btnEliminar" value="eliminar">
           <hr> 
            Buscar a:<input type="text" name="txtCriterio">
            en base a: <select name="txtCampo">
                        <option value="id">id</option>
                        <option value="nombre">nombre</option>
                        <option value="apellido">apellido</option>
                        <option value="edad">edad</option>
                      </select>
            <input type="submit" name="btnBuscar" value="Buscar">
            
        </form>

        <table border="1">
            <tr>
                <td>Id</td>
                <td>Nombres</td>
                <td>Apellidos</td>
                <td>Edad</td>
            </tr>
            
                <%
                    
                //filtrar
                if (request.getAttribute("filtro")!=null) {
                    datos = (List<Persona>)request.getAttribute("filtro");
                }else{
                    datos = dao.consultar();
                }    
                    
                

                for(Persona p : datos){
                %>
                   <tr>
                       <td><%= p.getId() %></td>
                       <td><%= p.getNombre() %></td>
                       <td><%= p.getApellido()%></td>
                       <td><%= p.getEdad() %></td>
                   </tr> 
                <%

            }

                %>
            
        </table>
    </body>
</html>

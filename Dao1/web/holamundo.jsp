<%@page import="test.*" %>%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! 
            String makeItLower(String data){
              return data.toLowerCase();
            }
        %>
        
        <h1>Hello World!  <%= new java.util.Date() %></h1> 
        <%= 6*2 %>
        <%
            for(int i=0;i<10;i++){
                out.println("</br> really: "+ i);
            }
        %>
        
        <p> 
            <%= makeItLower("HOLA PERRO") %>
        <p>
        
        <h3>Como realizar una funcion</h3>
        <%-- <%= test.funUtils.makeItLower("FUN FUN")%> !--%>
            
        <%= makeItLower("FUN FUN2")%>
        
        
        <p>reqest</p>
        <label>user agent: <%= request.getHeader("user-agent") %></label>  
        <br>
        <label>user agent: <%= request.getLocale() %></label>

        
    </body>
</html>

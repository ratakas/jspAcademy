<%-- 
    Document   : student-response
    Created on : Dec 26, 2017, 2:13:21 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>studen confirmacion tittle</h1>
        confirmed: ${param.firstName} ${param.lastName}
        <br>otros: <%= request.getParameter("lastName") %>
        <br>
        <% 
            String[] lang= request.getParameterValues("favLanguage");
            for(String tmp_lang : lang){
                out.println("<li>"+tmp_lang+"</li>");
            }
       
            Cookie theCookie= new Cookie("ape",request.getParameter("lastName"));
            theCookie.setMaxAge(60*60*24*360);
            response.addCookie(theCookie);
            %>
        
        
    </body>
</html>

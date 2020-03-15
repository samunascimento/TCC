<%-- 
    Document   : cadastro
    Created on : 06/01/2020, 23:22:40
    Author     : anton
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metrics</title>
    </head>
    <body>
        <h1>Metrics</h1>
                <h1 align="center" >Metrics</h1>
        <p>
            <%
                List<String> result = (List<String>) request.getAttribute("result");
                for(String s: result){
                    out.print("<p>line " + s + "</p>");
                }
            %>
        </p>
    </body>
</html>

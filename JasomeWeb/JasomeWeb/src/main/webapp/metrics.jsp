<%-- 
    Document   : cadastro
    Created on : 06/01/2020, 23:22:40
    Author     : anton
--%>

<%@page import="br.ufjf.dcc.gmr.core.jasome.Jasome"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metrics</title>
    </head>
    <body>
        <h1>Metrics</h1>
        <form method="post" action="JasomeWeb">
            <input type="text" name="repository">
            <input type="submit" value="show metrics">
        </form>
    </body>
</html>

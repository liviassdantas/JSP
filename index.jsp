<%-- 
    Document   : Teste
    Created on : 10/04/2019, 15:29:46
    Author     : Livia Dantas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="br.com.ConexaoBanco.ConexaoBanco"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testando</title>
    </head>
    <body>
        <h1>Testando</h1>
        
        <%out.println(ConexaoBanco.statusConection());%>
        <% ConexaoBanco conexao = new ConexaoBanco();%>
        <%conexao.getConexaoBanco();
        out.println(ConexaoBanco.statusConection());%>
        
        
    </body>
</html>

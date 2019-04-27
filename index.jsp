<%-- 
    Document   : Teste
    Created on : 10/04/2019, 15:29:46
    Author     : Livia Dantas
--%>
<%--importando as classes do projeto --%>
<%@page import="br.com.ConexaoBanco.PessoaDAO"%>
<%@page import="br.com.ConexaoBanco.Pessoa"%>
<%@page import="br.com.ConexaoBanco.ConexaoBanco"%> %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pessoa</title>
        <%--<link rel="stylesheet" href="/bootstrap.css"/>--%>
    </head>
    <body>
        <h1>Dados das Pessoas</h1> <%--título que vai aparacer na página--%>
        <% Pessoa pessoa = new Pessoa(); //instanciando a classe pessoa
        pessoa.setMatricula(75761);  //valores a serem atribuídos
        pessoa.setNome("Livia");
        pessoa.setTelefone("1236789");
        
        PessoaDAO pdao = new PessoaDAO(); //instanciando uma nova classe DAO
        pdao.Adiciona(pessoa);//adicionando os dados
        //exibir as informações - esse não é o melhor jeito!!
        out.println("\nMatrícula: \n");
        out.println("\n"+pessoa.getMatricula()+"\n");
        out.println("\nNome: \n");
        out.println("\n"+pessoa.getNome()+"\n");
        out.println("\nTelefone: \n");
        out.println("\n"+pessoa.getTelefone()+"\n");
       
        %>
        
            
                       
        
        
        
    </body>
</html>

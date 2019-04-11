//nome do pacote
package br.com.ConexaoBanco;
//bibliotecas para a mágica acontecer
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//iniciando a classe de conexão
public class ConexaoBanco {
           public static String status = "";
    
  //construtor da classe
    public ConexaoBanco(){
        
    }
  
 //metódo da conexão
    public static java.sql.Connection getConexaoBanco(){
        //atributo do tipo connection
            Connection connection = null;
            
           try{
               //carregando o jdbc padrão
              String driverName = "com.mysql.cj.jdbc.Driver";
              Class.forName(driverName);
              //url: nome do server + nome do banco +teste caso dê erro de fuso horário
              String url =  "jdbc:mysql://localhost:3306/trabalho?useTimezone=true&serverTimezone=UTC";
                    //configurando a conexão com o mysql
                    String username = "root";
                    String password = "senha";
                   connection = DriverManager.getConnection(url, username, password);
                    
                //testa sua conexão
                if(connection != null){
                    status = ("Status - conectado com sucesso");
                }else{
                    status = ("Status - Não conectado");
                }
                return connection;
                    
           }catch (ClassNotFoundException e){
               System.out.println("O driver especificado não foi especificado");
               return null;
         
               
           }catch (SQLException e){
               System.out.println("Não foi possível conectar ao banco de dados");
               System.out.println(e);
               return null;
           }
           
    }
   
    //método que retorna o status da conexão
    public static String statusConection(){
        return status;
    }
    //método que fecha a conexão
    public static Boolean FecharConexao(){
        try{
            ConexaoBanco.getConexaoBanco().close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    //método que reinicia a conexão
    public static java.sql.Connection ReiniciarConexao(){
        FecharConexao();
        return ConexaoBanco.getConexaoBanco();

}
    
}

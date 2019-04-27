/*Classe DAO - data access object
É a classe que vai conectar o banco aos elementos do sistema, onde serão iniciadas as queries do banco. */
package br.com.ConexaoBanco;
import java.sql.*;
import java.sql.PreparedStatement;

public class PessoaDAO {
   private final Connection connection; //iniciando uma variável de conexão do tipo Conexão do sql
    public PessoaDAO() {
        this.connection = ConexaoBanco.getConexaoBanco(); //instanciando uma nova conexão
    }
    /*Iniciando o CRUD
    método inserir/creat*/
    public void Adiciona(Pessoa pessoa){
        String sql = "insert into Pessoa"+"(matricula, nome, telefone)"+"values(?,?,?)";  //criando uma nova query
    try {
    PreparedStatement stmt = connection.prepareStatement(sql);
            //inserindo os valores no banco
            stmt.setInt(1, pessoa.getMatricula());
            stmt.setString(2,pessoa.getNome());
            stmt.setString(3,pessoa.getTelefone());
            //executa a query
            stmt.execute();
            //encerra o método
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
        //Para ler os dados inseridos no banco
        //método Read
        public void Resource() throws SQLException{
        PreparedStatement stmt = connection.prepareStatement("select * from Pessoa");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
         
        }
        stmt.close();
        }
        
}

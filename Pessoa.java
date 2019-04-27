package br.com.ConexaoBanco;
/*Classe javabean. Aqui só se declara as variáveis e os metódos getters e setters delas*/
public class Pessoa {
 private Integer matricula;
    private String nome, telefone;
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    
    
}

package classes;

public class Pessoa {
    private String nome;
    private String email;

    private String cpf;

    private String endereco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome(String nome) {
        return nome;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getCpf(String cpf) {
        return cpf;
    }

    public String getEndereco(String endereco) {
        return endereco;
    }

    public Pessoa (){

    }
}

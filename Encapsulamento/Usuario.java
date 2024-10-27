package Encapsulamento;

// Usuario.java
public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
}

public class ClienteP {
    // Atributos da classe Cliente
    private String nome;
    private String endereco;

    // Construtor da classe Cliente
    public ClienteP(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getter para obter as informações do cliente
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

public class Cliente {
    // Atributos da classe
    private String nome;
    private int idade;
    private String email;

    // Construtor da classe para inicializar os atributos
    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Getters e Setters para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para exibir mensagem de boas-vindas
    public void exibirBoasVindas() {
        System.out.println("Bem-vindo, " + nome + "!");
    }

    // Método para verificar se o cliente é maior de idade
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}


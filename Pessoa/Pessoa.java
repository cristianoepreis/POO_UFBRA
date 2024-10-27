package Pessoa;

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.setIdade(idade); // Usando o setter para validar a idade
        this.altura = altura;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade, com validação
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Deve ser maior que zero.");
        }
    }

    // Getter e Setter para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João Silva", 25, 1.75);

        // Exibindo informações da pessoa
        pessoa.exibirInformacoes();

        // Tentando definir uma idade inválida
        pessoa.setIdade(-5);

        // Alterando a idade para um valor válido
        pessoa.setIdade(30);

        // Exibindo informações atualizadas
        System.out.println("\nInformações atualizadas:");
        pessoa.exibirInformacoes();
    }
}

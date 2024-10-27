package Encapsulamento;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Testando Produto
        Produto produto = new Produto("Produto A", 20.0);
        produto.exibirInformacoes();

        // Testando ContaBancaria
        ContaBancaria conta = new ContaBancaria("123456");
        conta.depositar(100);
        conta.sacar(50);
        System.out.println("\n");
        System.out.println("Saldo: R$ " + conta.getSaldo());

        // Testando Carro
        Carro carro = new Carro("Fusca");
        carro.acelerar(20);
        carro.frear(10);
        System.out.println("\n");
        System.out.println("Velocidade do carro: " + carro.getVelocidade() + " km/h");

        // Testando Aluno
        Aluno aluno = new Aluno("João");
        aluno.setNota(7.5);
        System.out.println("\n");
        System.out.println("Aluno aprovado: " + aluno.isAprovado());

        // Testando Livro
        Filme filme = new Filme("Java Programming", "Autor A", 35.0);
        System.out.println("\n");
        System.out.println("Preço do livro: R$ " + filme.getPreco());

        // Testando Usuario
        Usuario usuario = new Usuario("Maria");
        usuario.setSenha("senha123");
        System.out.println("\n");
        System.out.println("Usuário: " + usuario.getNome());
    }
}

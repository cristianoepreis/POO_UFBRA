package Atividade1;
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Produto
        Produto produto1 = new Produto("Caneta", 2.50, 100);

        // Exibição das informações do produto
        produto1.exibirInformacoes();

        // Alterando o preço e quantidade do produto
        produto1.setPreco(2.80);
        produto1.setQuantidadeEstoque(120);

        // Exibição das informações atualizadas do produto
        System.out.println("\nInformações Atualizadas:");
        produto1.exibirInformacoes();
    }
}

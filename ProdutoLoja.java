public class ProdutoLoja {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public ProdutoLoja(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para aplicar um desconto ao preço
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            preco -= preco * (porcentagem / 100);
        }
    }

    // Método para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}

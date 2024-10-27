public class Item {
    // Atributos da classe Item
    private String nome;
    private double preco;

    // Construtor da classe Item
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos getter para obter as informações do item
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

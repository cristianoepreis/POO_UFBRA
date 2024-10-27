package Encapsulamento;

// Livro.java
public class Filme {
    private String titulo;
    private String autor;
    private double preco;

    public Filme(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }
}

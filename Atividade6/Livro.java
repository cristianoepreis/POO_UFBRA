package Atividade6;

public class Livro {
    // Atributos da classe Livro
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor para inicializar os atributos do livro
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters para acessar os atributos do livro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Método para exibir as informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}

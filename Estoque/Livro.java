package Estoque;

public class Livro {
    // Atributos da classe
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean emprestado;

    // Construtor para inicializar os atributos
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false; // Inicia como não emprestado
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não está emprestado.");
        }
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Livro
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863);

        // Exibindo informações iniciais do livro
        System.out.println("Informações do livro:");
        livro.exibirInformacoes();

        System.out.println("\nTentando emprestar o livro...");
        // Emprestando o livro
        livro.emprestar();

        // Exibindo informações após o empréstimo
        livro.exibirInformacoes();

        System.out.println("\nTentando emprestar o livro novamente...");
        // Tentativa de emprestar o livro novamente
        livro.emprestar();

        System.out.println("\nDevolvendo o livro...");
        // Devolvendo o livro
        livro.devolver();

        // Exibindo informações após a devolução
        livro.exibirInformacoes();
    }
}


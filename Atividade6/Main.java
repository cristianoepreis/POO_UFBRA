package Atividade6;

public class Main {
    public static void main(String[] args) {
        // Criação de uma nova biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criação de alguns livros
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Adição dos livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listagem de todos os livros na biblioteca
        biblioteca.listarLivros();

        // Pesquisa de um livro pelo título
        biblioteca.pesquisarLivro("1984");

        // Remoção de um livro
        biblioteca.removerLivro("Dom Quixote");

        // Listagem dos livros após a remoção
        biblioteca.listarLivros();
    }
}


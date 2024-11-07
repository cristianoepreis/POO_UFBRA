package Atividade6;

import java.util.ArrayList;

public class Biblioteca {
    // Lista para armazenar os livros
    private ArrayList<Livro> livros;

    // Construtor para inicializar a lista de livros
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado à biblioteca.");
    }

    // Método para remover um livro da biblioteca pelo título
    public void removerLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                System.out.println("Livro \"" + titulo + "\" removido da biblioteca.");
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }

    // Método para listar todos os livros da biblioteca
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na Biblioteca:");
            for (Livro livro : livros) {
                livro.exibirInformacoes();
                System.out.println("--------------------");
            }
        }
    }

    // Método para pesquisar um livro pelo título
    public void pesquisarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:");
                livro.exibirInformacoes();
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }
}

package Atividade5;

public class Projeto {
    // Atributos da classe
    private String nome;
    private String descricao;
    private String status;

    // Construtor para inicializar os atributos
    public Projeto(String nome, String descricao, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para atualizar o status do projeto
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado para: " + novoStatus);
    }

    // Método para exibir as informações do projeto
    public void exibirInformacoes() {
        System.out.println("Nome do Projeto: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
    }
}

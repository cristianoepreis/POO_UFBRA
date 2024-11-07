package Atividade5;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Projeto
        Projeto projeto1 = new Projeto("Website Institucional", "Desenvolvimento de um site para a empresa", "Em Andamento");

        // Exibição das informações do projeto
        projeto1.exibirInformacoes();
        System.out.println("\n");
        // Atualização do status do projeto
        projeto1.atualizarStatus("Concluído");

        // Exibição das informações do projeto após atualização
        projeto1.exibirInformacoes();
    }
}

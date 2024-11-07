public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Cliente
        Cliente cliente1 = new Cliente("Ana", 20, "ana@example.com");

        // Exibição da mensagem de boas-vindas
        cliente1.exibirBoasVindas();

        // Verificação se o cliente é maior de idade
        if (cliente1.isMaiorDeIdade()) {
            System.out.println(cliente1.getNome() + " é maior de idade.");
        } else {
            System.out.println(cliente1.getNome() + " não é maior de idade.");
        }
    }
}

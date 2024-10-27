public class Main {
    public static void main(String[] args) {
        // Criação de um cliente
        ClienteP clienteP = new ClienteP("João da Silva", "Rua das Flores, 123");

        // Criação de um pedido associado ao cliente
        Pedido pedido = new Pedido("001", clienteP);

        // Adição de itens ao pedido
        pedido.adicionarItem(new Item("Camiseta", 50.0));
        pedido.adicionarItem(new Item("Calça Jeans", 120.0));
        pedido.adicionarItem(new Item("Tênis", 200.0));

        // Exibindo informações do cliente e do pedido
        System.out.println("Cliente: " + clienteP.getNome());
        System.out.println("Endereço: " + clienteP.getEndereco());
        System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
        System.out.println("Itens do Pedido:");
        pedido.exibirItens();
        System.out.println("Valor Total do Pedido: R$ " + pedido.getValorTotal());
    }
}

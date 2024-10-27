import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Atributos da classe Pedido
    private String numeroPedido;
    private double valorTotal;
    private ClienteP clienteP;
    private List<Item> itens; // Lista de itens no pedido

    // Construtor da classe Pedido
    public Pedido(String numeroPedido, ClienteP clienteP) {
        this.numeroPedido = numeroPedido;
        this.clienteP = clienteP;
        this.itens = new ArrayList<>(); // Inicializa a lista de itens
        this.valorTotal = 0.0; // Inicializa o valor total
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(Item item) {
        itens.add(item);
        valorTotal += item.getPreco(); // Atualiza o valor total automaticamente
    }

    // Métodos getter para obter as informações do pedido
    public String getNumeroPedido() {
        return numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ClienteP getClienteP() {
        return clienteP;
    }

    // Método para exibir os itens do pedido
    public void exibirItens() {
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": R$ " + item.getPreco());
        }
    }
}

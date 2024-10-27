public class Pedido {
    public enum Status {
        PENDENTE, PROCESSANDO, COMPLETO, CANCELADO
    }

    private int id;
    private String cliente;
    private Status status;

    // Construtor
    public Pedido(int id, String cliente, Status status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    // Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

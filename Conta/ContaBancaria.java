package Conta;

public class ContaBancaria {
    // Atributos da classe
    private String titular;
    private double saldo;
    private int numeroConta;

    // Construtor para inicializar os atributos
    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando uma conta bancária para um titular
        ContaBancaria conta = new ContaBancaria("Maria Silva", 123456);

        // Exibindo informações iniciais da conta
        conta.exibirInformacoes();

        System.out.println("\nRealizando depósito...");
        // Depositando um valor na conta
        conta.depositar(500);

        // Exibindo informações após o depósito
        conta.exibirInformacoes();

        System.out.println("\nRealizando saque...");
        // Tentando sacar um valor da conta
        conta.sacar(200);

        // Exibindo informações após o saque
        conta.exibirInformacoes();

        System.out.println("\nTentativa de saque com valor superior ao saldo...");
        // Tentando sacar um valor maior que o saldo disponível
        conta.sacar(400);
    }
}

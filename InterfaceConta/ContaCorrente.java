package InterfaceConta;

// ContaCorrente.java
public class ContaCorrente implements ContaBancaria {
    private String numeroConta;
    private double saldo;
    private double limite;

    public ContaCorrente(String numeroConta, double limite) {
        this.numeroConta = numeroConta;
        this.limite = limite;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public String info() {
        return "Conta Corrente: " + numeroConta + ", Saldo: R$ " + consultarSaldo() + ", Limite: R$ " + limite;
    }
}
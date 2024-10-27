package InterfaceConta;

// ContaPoupanca.java
public class ContaPoupanca implements ContaBancaria {
    private String numeroConta;
    private double saldo;
    private double juros;

    public ContaPoupanca(String numeroConta, double juros) {
        this.numeroConta = numeroConta;
        this.juros = juros;
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
        if (valor > 0 && saldo >= valor) {
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

    public void aplicarJuros() {
        saldo += saldo * juros / 100;
        System.out.println("Juros aplicados: R$ " + (saldo * juros / 100));
    }

    public String info() {
        return "Conta Poupança: " + numeroConta + ", Saldo: R$ " + consultarSaldo() + ", Juros: " + juros + "%";
    }
}

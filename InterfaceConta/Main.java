package InterfaceConta;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente("1234-5", 1000.0);
        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        System.out.println(contaCorrente.info());

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("6789-0", 5.0);
        contaPoupanca.depositar(1000.0);
        contaPoupanca.aplicarJuros();
        contaPoupanca.sacar(300.0);
        System.out.println(contaPoupanca.info());
    }
}

package Atividade7;

public class Main {
    public static void main(String[] args) {
        // Criação do sistema bancário
        SistemaBanco banco = new SistemaBanco();

        // Criação de algumas contas
        banco.criarConta(1001, "Alice", 500.0);
        banco.criarConta(1002, "Bob", 1500.0);

        // Listagem de todas as contas
        banco.listarContas();

        // Verificação de saldo de uma conta específica
        banco.verificarSaldo(1001);

        // Depósito e saque em uma conta específica
        ContaBancaria conta = banco.buscarConta(1001);
        if (conta != null) {
            conta.depositar(200.0);
            conta.sacar(100.0);
            banco.verificarSaldo(1001);
        }
    }
}

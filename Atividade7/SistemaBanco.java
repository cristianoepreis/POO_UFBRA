package Atividade7;

import java.util.ArrayList;

public class SistemaBanco {
    // Lista de contas bancárias
    private ArrayList<ContaBancaria> contas;

    // Construtor
    public SistemaBanco() {
        contas = new ArrayList<>();
    }

    // Método para criar uma nova conta bancária
    public void criarConta(int numeroConta, String titular, double saldoInicial) {
        ContaBancaria novaConta = new ContaBancaria(numeroConta, titular, saldoInicial);
        contas.add(novaConta);
        System.out.println("Conta criada com sucesso! Número da Conta: " + numeroConta);
    }

    // Método para buscar uma conta bancária pelo número
    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;  // Retorna a conta encontrada
            }
        }
        return null;  // Retorna null se não encontrar a conta
    }

    // Método para listar todas as contas
    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há contas no sistema.");
        } else {
            System.out.println("Lista de Contas:");
            for (ContaBancaria conta : contas) {
                conta.exibirInformacoes();
                System.out.println("----------------------------");
            }
        }
    }

    // Método para verificar o saldo de uma conta
    public void verificarSaldo(int numeroConta) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("Saldo da conta " + numeroConta + ": R$" + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}

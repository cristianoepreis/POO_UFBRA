package Atividade4;
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Funcionario
        Funcionario funcionario1 = new Funcionario("Carlos", 3000.00, "Analista");

        // Exibição do salário base e cálculo do novo salário com aumento
        System.out.println("Salário Base: R$ " + funcionario1.getSalarioBase());
        double novoSalario = funcionario1.calcularSalarioComAumento(15); // Exemplo de 15% de aumento
        System.out.println("Salário com aumento de 15%: R$ " + novoSalario);

        // Cálculo do bônus anual
        double bonusAnual = funcionario1.calcularBonusAnual();
        System.out.println("Bônus Anual: R$ " + bonusAnual);
    }
}

public class Funcionario {
    private String nome;
    private double salarioMensal;

    // Construtor
    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    // Método Getter
    public double getSalarioMensal() {
        return salarioMensal;
    }

    // Método para calcular o salário anual
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para exibir informações do funcionário
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Salário Anual: " + calcularSalarioAnual());
    }
}

package HerancaFuncionario;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, double salario, String departamento, double bonus) {
        super(nome, cpf, salario); // Chama o construtor da classe base
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bonus; // Inclui bônus no cálculo
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + ", Departamento: " + departamento + ", Bônus: R$" + bonus;
    }
}
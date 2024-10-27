package HerancaFuncionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12; // Salário anual sem considerações adicionais
    }

    public String getInformacoes() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Salário: R$" + salario;
    }
}
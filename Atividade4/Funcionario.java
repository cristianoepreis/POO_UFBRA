package Atividade4;

public class Funcionario {
    // Atributos da classe
    private String nome;
    private double salarioBase;
    private String cargo;

    // Construtor para inicializar os atributos
    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    // Getters e Setters para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para calcular o novo salário com um aumento percentual
    public double calcularSalarioComAumento(double percentualAumento) {
        double aumento = salarioBase * (percentualAumento / 100);
        return salarioBase + aumento;
    }

    // Método para calcular o bônus anual (10% do salário base)
    public double calcularBonusAnual() {
        return salarioBase * 0.10;
    }
}


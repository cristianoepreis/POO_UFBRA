package Encapsulamento;

// Aluno.java
public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public double getNota() {
        return nota;
    }

    public boolean isAprovado() {
        return nota >= 6;
    }
}

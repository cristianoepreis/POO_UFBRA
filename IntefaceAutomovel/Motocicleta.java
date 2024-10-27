package IntefaceAutomovel;

// Motocicleta.java
public class Motocicleta implements Automovel {
    private String marca;
    private String modelo;
    private int ano;

    public Motocicleta(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void acelerar() {
        System.out.println("A motocicleta " + modelo + " está acelerando.");
    }

    @Override
    public void parar() {
        System.out.println("A motocicleta " + modelo + " parou.");
    }

    @Override
    public void acenderFarol() {
        System.out.println("Os faróis da motocicleta " + modelo + " estão acesos.");
    }

    public String info() {
        return "Motocicleta: " + marca + " " + modelo + " (" + ano + ")";
    }
}
package IntefaceAutomovel;


// Carro.java
public class Carro implements Automovel {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro " + modelo + " parou.");
    }

    @Override
    public void acenderFarol() {
        System.out.println("Os faróis do carro " + modelo + " estão acesos.");
    }

    public String info() {
        return "Carro: " + marca + " " + modelo + " (" + ano + ")";
    }
}
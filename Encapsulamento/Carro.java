package Encapsulamento;

// Carro.java
public class Carro {
    private String modelo;
    private double velocidade;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidade += valor;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        }
    }

    public void frear(double valor) {
        if (valor > 0 && valor <= velocidade) {
            velocidade -= valor;
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        }
    }

    public double getVelocidade() {
        return velocidade;
    }
}

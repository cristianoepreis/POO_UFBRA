package Carro;

// Arquivo Main.java
public class Main {
    public static void main(String[] args) {
        // Criando um carro com o modelo especificado
        CarroEncapsulamento meuCarro = new CarroEncapsulamento("Toyota Yaris");

        // Exibindo o status inicial do carro
        System.out.println("Status inicial do carro:");
        meuCarro.exibirStatus();

        System.out.println("\nAcelerando o carro...");
        // Acelerando o carro algumas vezes
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();

        // Exibindo o status do carro após acelerações
        meuCarro.exibirStatus();

        System.out.println("\nFreando o carro...");
        // Freando o carro uma vez
        meuCarro.frear();

        // Exibindo o status do carro após frenagem
        meuCarro.exibirStatus();

        System.out.println("\nAcendendo o farol...");
        // Acendendo o farol
        meuCarro.acenderFarol();

        // Exibindo o status final do carro
        System.out.println("\nStatus final do carro:");
        meuCarro.exibirStatus();

        System.out.println("\nApagando o farol...");
        // Apagando o farol
        meuCarro.apagarFarol();

        // Exibindo o status final do carro
        meuCarro.exibirStatus();
    }
}

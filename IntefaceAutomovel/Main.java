package IntefaceAutomovel;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando um carro Honda Fit
        HondaFit hondaFit = new HondaFit(2024);
        System.out.println(hondaFit.info());
        hondaFit.acelerar();
        hondaFit.acenderFarol();
        hondaFit.parar();

        // Criando uma motocicleta
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2022);
        System.out.println("\n" + motocicleta.info());
        motocicleta.acelerar();
        motocicleta.acenderFarol();
        motocicleta.parar();
    }
}


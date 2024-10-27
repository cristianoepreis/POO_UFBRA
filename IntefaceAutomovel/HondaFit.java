package IntefaceAutomovel;

// HondaFit.java
public class HondaFit extends Carro {
    public HondaFit(int ano) {
        super("Honda", "Fit", ano);
    }

    @Override
    public String info() {
        return "Honda Fit: " + super.info();
    }
}

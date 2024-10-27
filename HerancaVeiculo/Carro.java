package HerancaVeiculo;

// Carro.java
import java.util.ArrayList;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    private double velocidadeAtual;
    private ArrayList<String> passageiros;

    public Carro(String marca, String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.velocidadeAtual = 0; // Inicia a velocidade em 0
        this.passageiros = new ArrayList<>(); // Inicializa a lista de passageiros
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getVelocidade() {
        return velocidadeAtual;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Incremento deve ser positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0; // Não permite velocidade negativa
            }
            System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Decremento deve ser positivo.");
        }
    }

    public boolean isEsportivo() {
        String[] modelosEsportivos = {"Civic Type R", "Mustang", "Porsche 911", "Ferrari", "Lamborghini"};
        for (String modeloEsportivo : modelosEsportivos) {
            if (getModelo().equalsIgnoreCase(modeloEsportivo)) {
                return true; // O carro é considerado esportivo
            }
        }
        return false; // O carro não é esportivo
    }

    public void adicionarPassageiro(String nome) {
        if (passageiros.size() < numeroPortas) {
            passageiros.add(nome);
            System.out.println("Passageiro " + nome + " adicionado ao carro " + getModelo() + ".");
        } else {
            System.out.println("Não é possível adicionar mais passageiros, limite alcançado.");
        }
    }

    public void removerPassageiro(String nome) {
        if (passageiros.remove(nome)) {
            System.out.println("Passageiro " + nome + " removido do carro " + getModelo() + ".");
        } else {
            System.out.println("Passageiro " + nome + " não encontrado.");
        }
    }

    public void listarPassageiros() {
        if (passageiros.isEmpty()) {
            System.out.println("Não há passageiros no carro " + getModelo() + ".");
        } else {
            System.out.println("Passageiros no carro " + getModelo() + ": " + passageiros);
        }
    }

    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro " + getModelo() + ".");
        // Aqui poderiam ser adicionadas mais funcionalidades de manutenção
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() +
               ", Número de Portas: " + numeroPortas +
               ", Tipo de Combustível: " + tipoCombustivel +
               ", Velocidade Atual: " + velocidadeAtual + " km/h" +
               ", Esportivo: " + (isEsportivo() ? "Sim" : "Não");
    }
}
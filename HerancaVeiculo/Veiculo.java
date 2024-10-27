package HerancaVeiculo;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = 0; // Inicia a quilometragem em 0
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void abastecer(double litros) {
        if (litros > 0) {
            System.out.println("Abastecendo " + litros + " litros no veículo " + modelo + ".");
        } else {
            System.out.println("A quantidade de litros deve ser positiva.");
        }
    }

    public void adicionarQuilometragem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Adicionando " + km + " km ao veículo " + modelo + ".");
        } else {
            System.out.println("A quilometragem deve ser positiva.");
        }
    }

    public String getInformacoes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Quilometragem: " + quilometragem + " km";
    }
}
package Retangulo;

public class Retangulo {
    // Atributos da classe
    private double largura;
    private double altura;

    // Construtor para inicializar a largura e altura do retângulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para verificar se o retângulo é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um retângulo com largura 5 e altura 5
        Retangulo retangulo = new Retangulo(5, 5);

        // Exibindo a área do retângulo
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        // Exibindo o perímetro do retângulo
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        // Verificando se é um quadrado
        if (retangulo.isQuadrado()) {
            System.out.println("O retângulo é um quadrado.");
        } else {
            System.out.println("O retângulo não é um quadrado.");
        }
    }
}

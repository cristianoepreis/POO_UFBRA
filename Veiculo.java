public class Veiculo {
    private Double velocidade;
    private String modelo;
    private boolean farolAceso;
    private final double VELOCIDADE_MAXIMA = 200.0; // Velocidade máxima em km/h
    private final double ACELERACAO = 10.0; // Incremento de velocidade ao acelerar

    // Construtor
    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0.0;
        this.farolAceso = false;
    }

    // Método para acelerar
    public void acelerar() {
        if (velocidade + ACELERACAO <= VELOCIDADE_MAXIMA) {
            velocidade += ACELERACAO;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            velocidade = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade máxima atingida: " + VELOCIDADE_MAXIMA + " km/h");
        }
    }

    // Método para frear
    public void frear() {
        if (velocidade > 0) {
            velocidade -= ACELERACAO;
            if (velocidade < 0) {
                velocidade = 0.0;
            }
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    // Método para acender o farol
    public void acenderFarol() {
        if (!farolAceso) {
            farolAceso = true;
            System.out.println("Farol aceso.");
        } else {
            System.out.println("O farol já está aceso.");
        }
    }

    // Método para apagar o farol
    public void apagarFarol() {
        if (farolAceso) {
            farolAceso = false;
            System.out.println("Farol apagado.");
        } else {
            System.out.println("O farol já está apagado.");
        }
    }

    // Método para exibir o estado atual do carro
    public void exibirStatus() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
        System.out.println("Farol: " + (farolAceso ? "Aceso" : "Apagado"));
    }

    // Getters e Setters
    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        if (velocidade <= VELOCIDADE_MAXIMA && velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isFarolAceso() {
        return farolAceso;
    }

// Atributos:
//     farolAceso: Para controlar o estado do farol (aceso ou apagado).
//     VELOCIDADE_MAXIMA e ACELERACAO: Constantes para definir a velocidade máxima e o incremento de velocidade ao acelerar.

// Métodos Adicionais:
//     acenderFarol() e apagarFarol(): Para controlar o estado do farol.
//     exibirStatus(): Exibe o modelo, a velocidade atual e o estado do farol.

// Controle de Velocidade:
//     acelerar() verifica se a velocidade máxima foi atingida antes de incrementar.
//     frear() verifica se o carro está em movimento e reduz a velocidade progressivamente.


public class Main {
    public static void main(String[] args) {
        // Criando um carro com o modelo especificado
        Veiculo meuCarro = new Veiculo("Toyota Corolla");

        // Exibindo o status inicial do carro
        System.out.println("\n\nStatus inicial do carro:");
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

}

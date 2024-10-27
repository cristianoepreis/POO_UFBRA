package HerancaVeiculo;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Volkswagen", "Gol", 2022, 4, "Gasolina");

        // Exibindo informações do carro
        System.out.println(meuCarro.getInformacoes());

        // Testando aceleração
        meuCarro.acelerar(50);
        System.out.println(meuCarro.getInformacoes());

        // Testando frenagem
        meuCarro.frear(20);
        System.out.println(meuCarro.getInformacoes());

        // Testando adição de passageiros
        meuCarro.adicionarPassageiro("João");
        meuCarro.adicionarPassageiro("Maria");
        meuCarro.adicionarPassageiro("Pedro");
        meuCarro.adicionarPassageiro("Ana"); // Deve avisar que o limite foi alcançado

        // Listando passageiros
        meuCarro.listarPassageiros();

        // Removendo um passageiro
        meuCarro.removerPassageiro("Maria");
        meuCarro.listarPassageiros();

        // Testando abastecimento
        meuCarro.abastecer(40);
        meuCarro.adicionarQuilometragem(150); // Adicionando quilometragem

        // Realizando manutenção
        meuCarro.realizarManutencao();

        // Criando um carro esportivo
        Carro carroEsportivo = new Carro("Honda", "Civic Type R", 2021, 4, "Gasolina");
        System.out.println(carroEsportivo.getInformacoes());
    }
}

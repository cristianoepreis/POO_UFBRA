package HerancaFuncionario;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Funcionario
        Funcionario funcionario = new Funcionario("Carlos Silva", "123.456.789-00", 3000);
        System.out.println(funcionario.getInformacoes());
        System.out.println("Salário Anual: R$" + funcionario.calcularSalarioAnual());

        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Ana Oliveira", "987.654.321-00", 8000, "Tecnologia", 2000);
        System.out.println("\n" + gerente.getInformacoes());
        System.out.println("Salário Anual: R$" + gerente.calcularSalarioAnual());

        // Criando um objeto Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro Souza", "456.789.123-00", 5000);
        desenvolvedor.adicionarLinguagem("Java");
        desenvolvedor.adicionarLinguagem("JavaScript");
        desenvolvedor.adicionarProjeto("Sistema de Gestão");
        desenvolvedor.adicionarProjeto("Aplicativo Mobile");

        System.out.println("\n" + desenvolvedor.getInformacoes());
        System.out.println("Salário Anual: R$" + desenvolvedor.calcularSalarioAnual());
    }
}

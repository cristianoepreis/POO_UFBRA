package HerancaFuncionario;

import java.util.ArrayList;

public class Desenvolvedor extends Funcionario {
    private ArrayList<String> linguagens;
    private ArrayList<String> projetos;

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario); // Chama o construtor da classe base
        this.linguagens = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public void adicionarLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public void adicionarProjeto(String projeto) {
        projetos.add(projeto);
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + ", Linguagens: " + linguagens + ", Projetos: " + projetos;
    }
}
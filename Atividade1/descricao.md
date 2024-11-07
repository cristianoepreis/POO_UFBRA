Atividade 1: Criando a Classe "Produto"
    Objetivo: Entender os conceitos básicos de criação de classes e atributos.
    Descrição: Peça aos alunos que criem uma classe chamada Produto, que representa um item de um catálogo de produtos. A classe deve ter três atributos: nome (String), preco (double), e quantidadeEstoque (int).
    Instruções: Os alunos devem adicionar métodos para definir e obter valores dos atributos (getters e setters) e um construtor para inicializar todos os atributos.

Explicação dos Componentes da Classe
    1 - Atributos: Definimos três atributos privados (nome, preco e quantidadeEstoque) que representam as propriedades de um produto. Torná-los privados ajuda a proteger os dados, um conceito conhecido como encapsulamento.

    2 - Construtor: O construtor é um método especial que tem o mesmo nome da classe e é usado para inicializar os atributos da classe quando um objeto Produto é criado.

    3 - Getters e Setters: Métodos getNome, getPreco, getQuantidadeEstoque (getters) permitem acessar o valor dos atributos, enquanto os métodos setNome, setPreco, setQuantidadeEstoque (setters) permitem modificar os valores dos atributos, garantindo que o código fora da classe possa acessar e modificar esses atributos de maneira controlada.

    4 - Método Adicional (exibirInformacoes): Esse método exibe as informações do produto de forma legível, útil para verificar rapidamente os valores dos atributos.
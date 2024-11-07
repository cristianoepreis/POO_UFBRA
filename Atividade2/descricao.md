Atividade 2: Classe "Cliente"
    Objetivo: Trabalhar com encapsulamento e métodos.
    Descrição: Crie uma classe Cliente que representa um cliente de uma loja. A classe deve ter os seguintes atributos: nome (String), idade (int), email (String).
    Instruções: Adicione métodos para exibir uma mensagem de boas-vindas ao cliente e para verificar se o cliente é maior de idade (idade >= 18).

Explicação dos Componentes da Classe
    1 - Atributos: A classe possui três atributos privados (nome, idade, e email) que representam as informações do cliente. A proteção desses dados é feita através do encapsulamento, garantindo que esses valores sejam acessados e modificados apenas por métodos específicos da classe.

    2 - Construtor: O construtor inicializa os atributos nome, idade e email quando um novo objeto Cliente é criado.

    3 - Getters e Setters: Os métodos getNome, getIdade e getEmail (getters) permitem acessar o valor dos atributos. Os métodos setNome, setIdade e setEmail (setters) permitem modificá-los.

    4 - Método exibirBoasVindas: Este método exibe uma mensagem de boas-vindas para o cliente, usando o nome fornecido.

    5 - Método isMaiorDeIdade: Este método verifica se o cliente é maior de idade (idade >= 18) e retorna true se for o caso, e false caso contrário.
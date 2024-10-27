Explicação do Código
Interface Automovel: Define os métodos que todos os automóveis devem implementar (acelerar, parar, acenderFarol).

Classe Carro:

Implementa a interface Automovel.
Tem atributos como marca, modelo e ano, além de métodos que implementam as funções definidas pela interface.
O método info() retorna informações sobre o carro.
Classe HondaFit:

Herda de Carro e fornece uma implementação específica para a classe Honda Fit.
Override do método info() para incluir detalhes adicionais.
Classe Motocicleta:

Implementa a interface Automovel de forma semelhante à classe Carro, mas com seus próprios atributos e métodos.
Classe Main:

Cria instâncias de HondaFit e Motocicleta, chamando métodos para demonstrar o funcionamento.
Executando o Código
Ao executar a classe Main, você verá a saída que demonstra as operações de um carro e uma motocicleta, mostrando como a interface e a herança são usadas na prática. Se precisar de mais detalhes ou ajustes, é só avisar!
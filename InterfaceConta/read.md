Explicação do Código
Interface ContaBancaria: Define os métodos que todas as contas bancárias devem implementar (depositar, sacar, consultarSaldo).

Classe ContaCorrente:

Implementa a interface ContaBancaria.
Tem atributos como numeroConta, saldo e limite.
Implementa os métodos da interface e fornece uma descrição da conta com o método info().
Classe ContaPoupanca:

Também implementa a interface ContaBancaria.
Tem atributos como numeroConta, saldo e juros.
Implementa os métodos da interface e adiciona um método para aplicar juros.
Classe Main:

Cria instâncias de ContaCorrente e ContaPoupanca, chamando métodos para demonstrar o funcionamento, como depósito, saque e consulta de saldo.
Executando o Código
Ao executar a classe Main, você verá a saída que demonstra as operações em uma conta corrente e uma conta poupança, mostrando como a interface é usada na prática. Se precisar de mais detalhes ou ajustes, é só avisar!
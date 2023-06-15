# Importando as classes do modelo

from modelo.Cliente import Cliente
from modelo.ContaCorrente import ContaCorrente
from modelo.ContaPoupanca import ContaPoupanca
from modelo.Endereco import Endereco
from modelo.Transacao import Transacao
from repositorio.Banco import Banco

# Criando objetos de endereço
endereco_cliente = Endereco("Rua A", "Cidade X", "Estado Y", "12345-678")
endereco_banco = Endereco("Rua B", "Cidade Z", "Estado W", "98765-432")

# Criando objeto de cliente
cliente = Cliente("Fulano", "123.456.789-00", "123456789", endereco_cliente)

# Criando objetos de contas
conta1 = ContaCorrente("001", 1000.0, cliente, 500.0)
conta2 = ContaPoupanca("002", 2000.0, cliente, 2.5)

# Criando objeto de transação
transacao1 = Transacao(1, "Depósito", 500.0)

# Adicionando a transação à conta
conta1.getHistoricoTransacoes().append(transacao1)

# Criando objeto de banco
banco = Banco("Meu Banco", endereco_banco)

# Adicionando cliente e conta ao banco
banco.adicionarCliente(cliente)
banco.adicionarConta(conta1)
banco.adicionarConta(conta2)

# Realizando operações na conta
conta1.depositar(100.0)
conta1.sacar(200.0)
conta1.transferir(300.0, conta2)

# Exibindo informações do cliente
print(cliente)

# Exibindo informações das contas
print(conta1)
print(conta2)

# Exibindo informações da transação
print(transacao1)

# Exibindo informações do banco
print(banco)

# Buscando cliente e conta no banco
cpf = "123.456.789-00"
numero_conta = "001"

cliente_encontrado = banco.buscarCliente(cpf)
conta_encontrada = banco.buscarConta(numero_conta)

if cliente_encontrado:
    print("Cliente encontrado:", cliente_encontrado)

if conta_encontrada:
    print("Conta encontrada:", conta_encontrada)

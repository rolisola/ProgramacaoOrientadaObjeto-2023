class Banco:
    def __init__(self, nome, endereco):
        self._nome = nome
        self._endereco = endereco
        self._clientes = []
        self._contas = []

    def getNome(self):
        return self._nome

    def getEndereco(self):
        return self._endereco

    def getClientes(self):
        return self._clientes

    def getContas(self):
        return self._contas

    def adicionarCliente(self, cliente):
        if cliente not in self._clientes:
            self._clientes.append(cliente)
        else:
            print("Cliente já existe no banco.")

    def adicionarConta(self, conta):
        if conta not in self._contas:
            self._contas.append(conta)
        else:
            print("Conta já existe no banco.")

    def removerCliente(self, cliente):
        if cliente in self._clientes:
            contas_cliente = cliente.getContas()
            for conta in contas_cliente:
                if conta.getSaldo() != 0:
                    print("Não é possível remover o cliente. Algumas contas possuem saldo pendente.")
                    return
            self._clientes.remove(cliente)
        else:
            print("Cliente não encontrado.")

    def removerConta(self, conta):
        if conta in self._contas:
            if conta.getSaldo() == 0:
                self._contas.remove(conta)
            else:
                print("Não é possível remover a conta. Ela possui saldo pendente.")
        else:
            print("Conta não encontrada.")

    def buscarCliente(self, cpf):
        for cliente in self._clientes:
            if cliente.getCPF() == cpf:
                return cliente
        print("Cliente não encontrado.")
        return None

    def buscarConta(self, numero):
        for conta in self._contas:
            if conta.getNumero() == numero:
                return conta
        print("Conta não encontrada.")
        return None

    def __str__(self):
        return f"Nome do Banco: {self._nome}\nEndereço do Banco: {self._endereco}"

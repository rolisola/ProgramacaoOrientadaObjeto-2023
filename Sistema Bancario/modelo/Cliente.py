class Cliente:
    def __init__(self, nome, cpf, telefone, endereco):
        self._nome = nome
        self._cpf = cpf
        self._telefone = telefone
        self._endereco = endereco
        self._contas = []

    def getNome(self):
        return self._nome

    def getCPF(self):
        return self._cpf

    def getTelefone(self):
        return self._telefone

    def getEndereco(self):
        return self._endereco

    def getContas(self):
        return self._contas

    def adicionarConta(self, conta):
        self._contas.append(conta)

    def removerConta(self, conta):
        if conta in self._contas:
            if conta.getSaldo() == 0:
                self._contas.remove(conta)
            else:
                print("Não é possível fechar a conta. Ela possui saldo pendente.")
        else:
            print("Conta não encontrada.")

    def buscarConta(self, numero_conta):
        for conta in self._contas:
            if conta.getNumero() == numero_conta:
                return conta
        print("Conta não encontrada.")
        return None

    def possuiContas(self):
        return len(self._contas) > 0

    def __str__(self):
        return f"Nome: {self._nome}\nCPF: {self._cpf}\nTelefone: {self._telefone}\nEndereço: {self._endereco}"

from modelo.Conta import Conta


class ContaPoupanca(Conta):
    def __init__(self, numero, saldo, titular, taxaRendimento):
        super().__init__(numero, saldo, titular)
        self._taxaRendimento = taxaRendimento

    def getTaxaRendimento(self):
        return self._taxaRendimento

    def calcularRendimento(self):
        rendimento = self._saldo * (self._taxaRendimento / 100)
        self.depositar(rendimento)
        return rendimento

    def __str__(self):
        return f"Número da Conta: {self._numero}\nSaldo: {self._saldo}\nTitular: {self._titular}\nTaxa de Rendimento: {self._taxaRendimento}"

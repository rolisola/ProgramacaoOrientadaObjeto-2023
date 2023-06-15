from modelo.Conta import Conta


class ContaCorrente(Conta):
    def __init__(self, numero, saldo, titular, limiteEspecial):
        super().__init__(numero, saldo, titular)
        self._limiteEspecial = limiteEspecial

    def getLimiteEspecial(self):
        return self._limiteEspecial

    def __str__(self):
        return f"Número da Conta: {self._numero}\nSaldo: {self._saldo}\nTitular: {self._titular}\nLimite Especial: {self._limiteEspecial}"

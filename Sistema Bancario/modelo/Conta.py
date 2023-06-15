from modelo.Transacao import Transacao


class Conta:
    def __init__(self, numero, saldo, titular):
        self._numero = numero
        self._saldo = saldo
        self._titular = titular
        self._historicoTransacoes = []

    # Getters
    def getNumero(self):
        return self._numero

    def getSaldo(self):
        return self._saldo

    def getTitular(self):
        return self._titular

    def getHistoricoTransacoes(self):
        return self._historicoTransacoes

    def depositar(self, valor):
        if valor > 0:
            self._saldo += valor
            transacao = Transacao(len(self._historicoTransacoes) + 1, "Depósito", valor)
            self._historicoTransacoes.append(transacao)
        else:
            print("Valor inválido para depósito.")

    def sacar(self, valor):
        if 0 < valor <= self._saldo:
            self._saldo -= valor
            transacao = Transacao(len(self._historicoTransacoes) + 1, "Saque", valor)
            self._historicoTransacoes.append(transacao)
        else:
            print("Valor inválido para saque ou saldo insuficiente.")

    def transferir(self, valor, conta_destino):
        if 0 < valor <= self._saldo:
            self._saldo -= valor
            enviar = Transacao(len(self._historicoTransacoes) + 1, "Transferência Enviada", valor)
            self._historicoTransacoes.append(enviar)
            conta_destino.depositar(valor)
            receber = Transacao(len(conta_destino.getHistoricoTransacoes()) + 1, "Transferência Recebida", valor)
            conta_destino.getHistoricoTransacoes().append(receber)
        else:
            print("Valor inválido para transferência ou saldo insuficiente.")

    def __str__(self):
        return f"Número da Conta: {self._numero}\nSaldo: {self._saldo}\nTitular: {self._titular}"

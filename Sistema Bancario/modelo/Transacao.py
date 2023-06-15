import datetime

class Transacao:
    def __init__(self, id, tipoTransacao, valor):
        self._id = id
        self._data = datetime.date.today()  # Data atual
        self._tipoTransacao = tipoTransacao
        self._valor = valor

    def getId(self):
        return self._id

    def getData(self):
        return self._data

    def getTipoTransacao(self):
        return self._tipoTransacao

    def getValor(self):
        return self._valor

    def __str__(self):
        return f"ID: {self._id}\nData: {self._data}\nTipo de Transação: {self._tipoTransacao}\nValor: {self._valor}"

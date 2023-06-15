class Endereco:
    def __init__(self, rua, cidade, estado, cep):
        self._rua = rua
        self._cidade = cidade
        self._estado = estado
        self._cep = cep

    # Getters
    def getRua(self):
        return self._rua

    def getCidade(self):
        return self._cidade

    def getEstado(self):
        return self._estado

    def getCep(self):
        return self._cep

    def __str__(self):
        return f"Rua: {self._rua}\nCidade: {self._cidade}\nEstado: {self._estado}\nCEP: {self._cep}"

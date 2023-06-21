class Veiculo:
    def __init__(self, tipo, marca, modelo, ano, placa):
        self.tipo = tipo
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.placa = placa

class Carro(Veiculo):
    def __init__(self, tipo, marca, modelo, ano, placa, nPortas):
        super().__init__(tipo, marca, modelo, ano, placa)
        self.nPortas = nPortas

class Moto(Veiculo):
    def __init__(self, tipo, marca, modelo, ano, placa, cilindrada):
        super().__init__(tipo, marca, modelo, ano, placa)
        self.cilindrada = cilindrada

carro1 = Carro("Hatch", "Fiat", "uno", 2020, "POO-2023", 5)
moto1 = Moto("Naked", "Honda", "CG", 2023, "DA10AI", 160)

print(isinstance(carro1, Carro), isinstance(carro1, Moto))
print(isinstance(moto1, Carro), isinstance(moto1, Moto))
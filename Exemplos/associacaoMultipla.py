class Motor:
    def __init__(self, tipo):
        self.tipo = tipo

class Pessoa:
    def __init__(self, nome):
        self.nome = nome

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor
        self.ocupantes = []

    def adicionar_ocupante(self, pessoa):
        self.ocupantes.append(pessoa)

    def __str__(self):
        return f"Carro: {self.marca} {self.modelo}\nMotor: {self.motor.tipo}\nOcupantes: {', '.join([pessoa.nome for pessoa in self.ocupantes])}"

motor1 = Motor("V8")
pessoa1 = Pessoa("João")
pessoa2 = Pessoa("Maria")

carro1 = Carro("Ford", "Mustang", motor1)
carro1.adicionar_ocupante(pessoa1)
carro1.adicionar_ocupante(pessoa2)

print(carro1)
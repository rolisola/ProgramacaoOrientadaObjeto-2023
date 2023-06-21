class Motor:
    def __init__(self, tipo):
        self.tipo = tipo

    def ligar(self):
        print("Motor ligado.")

    def desligar(self):
        print("Motor desligado.")

class Carro:
    def __init__(self, motor):
        self.motor = motor

    def ligar_carro(self):
        self.motor.ligar()

    def desligar_carro(self):
        self.motor.desligar()

motor1 = Motor("Gasolina")
carro1 = Carro(motor1)
carro1.ligar_carro()
carro1.desligar_carro()

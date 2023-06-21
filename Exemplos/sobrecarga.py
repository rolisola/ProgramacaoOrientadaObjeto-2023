class Pessoa:
    def __init__(self, nome):
        self.nome = nome
    
    def __setattr__(self, nome, valor):
        print(f'Atribuindo o valor {valor} ao atributo {nome}')
        self.__dict__[nome] = valor


pessoa = Pessoa("João")
pessoa.idade = 25

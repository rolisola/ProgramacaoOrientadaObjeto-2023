class Animal:
    def fazer_som(self):
        pass

class Cachorro(Animal):
    def fazer_som(self):
        print("O cachorro late.")

class Gato(Animal):
    def fazer_som(self):
        print("O gato mia.")

cachorro = Cachorro()
gato = Gato()

cachorro.fazer_som()
gato.fazer_som()
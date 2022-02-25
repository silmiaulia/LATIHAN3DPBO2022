
# Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

class Processor:

    def __init__(self): #Constructor

        # atribut
        self.price = 0
        self.name = ""


    # metode getter dan setter

    def getPrice(self):
        return self.price
    
    def setPrice(self, price):
        self.price = price
    
    def getName(self):
        return self.name
    
    def setName(self, name):
        self.name = name
    

    # untuk print atribut kelas Processor
    def PrintProcessor(self):
        print("===== PROCESSOR =====")
        print(" Name  : " + self.getName())
        print(" Price : " + str(self.getPrice()))
    

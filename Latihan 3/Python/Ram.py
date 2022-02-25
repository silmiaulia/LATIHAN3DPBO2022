
# Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

class Ram:

    def __init__(self): #Constructor

        # atribut
        self.capacity = 0
        self.price = 0

    # metode getter dan setter

    def getCapacity(self):
        return self.capacity
    
    def setCapacity(self, capacity):
        self.capacity = capacity

    def getPrice(self):
        return self.price
    
    def setPrice(self, price):
        self.price = price


    # untuk print atribut kelas Ram
    def PrintRam(self):
        print("======= RAM =========")
        print(" Capacity : " + str(self.getCapacity()) + " GB")
        print(" Price    : " + str(self.getPrice()))

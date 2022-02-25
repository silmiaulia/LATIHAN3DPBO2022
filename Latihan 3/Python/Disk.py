
# Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

class Disk:

    def __init__(self): #Constructor

        # atribut
        self.capacity = 0
        self.price = 0
        self.type = ""


    # metode getter dan setter

    def getCapacity(self):
        return self.capacity
    
    def setCapacity(self, capacity):
        self.capacity = capacity

    def getPrice(self):
        return self.price
    
    def setPrice(self, price):
        self.price = price
    
    def getType(self):
        return self.type
    
    def setType(self, type):
        self.type = type
    

    # untuk print atribut kelas Disk
    def PrintDisk(self):
        print("======= DISK ========")
        print(" Type     : " + self.getType())
        print(" Capacity : " + str(self.getCapacity()) + " GB")
        print(" Price    : " + str(self.getPrice()))

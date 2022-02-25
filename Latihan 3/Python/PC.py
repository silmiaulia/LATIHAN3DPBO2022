
# Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 

from Disk import Disk #melakukan import class
from Processor import Processor #melakukan import class
from Ram import Ram #melakukan import class

class PC:


    def __init__(self): #Constructor

        # atribut
        self.p = Processor()
        self.d = Disk()
        self.r = Ram()
        self.totalPrice = 0

    # metode getter dan setter

    def getP(self):
        return self.p
    
    def setP(self, p):
        self.p = p

    def getD(self):
        return self.d
    
    def setD(self, d):
        self.d = d

    def getR(self):
        return self.r
    
    def setR(self, r):
        self.r = r

    def getTotalPrice(self):
        return self.totalPrice
    
    def setTotalPrice(self, totalPrice):
        self.totalPrice = totalPrice


    # untuk print spesifikasi pc
    def PrintPC(self):

        self.p.PrintProcessor()
        self.d.PrintDisk()
        self.r.PrintRam()
        print("=====================")
        print("Total Price : " + str(self.getTotalPrice()))
 
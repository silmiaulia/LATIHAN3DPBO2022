# Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin 


from PC import PC #melakukan import class
from Disk import Disk #melakukan import class
from Processor import Processor #melakukan import class
from Ram import Ram #melakukan import class

n = 0 # untuk menyimpan jumlah input
i = 0 # untuk iterasi

n = int(input("Masukan Jumlah PC : ")) # meminta banyak jumlah input


# membuat array objek 
p = [Processor() for i in range(n)] 
d = [Disk() for i in range(n)] 
r = [Ram() for i in range(n)] 
pc = [PC() for i in range(n)] 

for i in range(n):

    print("INPUT SPESIFIKASI PC " + str(i+1))

    # melakukan input spesifikasi pc sebanyak n

    print("Processor Name : ", end ="")
    processorName = str(input())

    print("Processor Price : ", end ="")
    processorPrice = int(input())

    print("Disk Type : ", end ="")
    diskType = str(input())

    print("Disk Capacity : ", end ="")
    diskCapacity = int(input())

    print("Disk Price : ", end ="")
    diskPrice = int(input())

    print("Ram Capacity : ", end ="")
    ramCapacity = int(input())

    print("Ram Price : ", end ="")
    ramPrice = int(input())
    print()


    # gunakan prosedur setter dari objek untuk mengisi atribut
      
    p[i].setName(processorName)
    p[i].setPrice(processorPrice)

    d[i].setType(diskType)
    d[i].setCapacity(diskCapacity)
    d[i].setPrice(diskPrice)

    r[i].setCapacity(ramCapacity)
    r[i].setPrice(ramPrice)

    pc[i].setP(p[i])
    pc[i].setD(d[i])
    pc[i].setR(r[i])

    totalPrice = p[i].getPrice() + d[i].getPrice() + r[i].getPrice()
    pc[i].setTotalPrice(totalPrice)


for i in range(n):
    # menampilkan data sepsifikasi pc
    print("=====================")
    print("  SPESIFIKASI PC " + str(i+1))
    print("=====================")
    pc[i].PrintPC()

    print()


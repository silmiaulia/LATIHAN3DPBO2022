/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <bits/stdc++.h>
#include <string>

using namespace std;

#include "Processor.cpp"
#include "Disk.cpp"
#include "Ram.cpp"
#include "Pc.cpp"

int main(){

    int n =0, i = 0; //variabel untuk jumlah input dan untuk iterasi

    cout << "Masukan Jumlah PC : "; 
    cin>>n; //meminta jumlah inputan

    Processor p[n];
    Disk d[n];
    Ram r[n];
    Pc pc[n];

    for(i=0; i<n; i++){

        int processorPrice, diskPrice, ramPrice, diskCapacity, ramCapacity, totalPrice;
        string processorName, diskType;
    

        cout << "INPUT SPESIFIKASI PC " << i+1 << endl;

        cout << "Processor Name : ";
        cin >> processorName; 
        cout << "Processor Price : ";
        cin >> processorPrice; 
        cout << "Disk Type : ";
        cin >> diskType; 
        cout << "Disk Capacity : ";
        cin >> diskCapacity; 
        cout << "Disk Price : ";
        cin >> diskPrice; 
        cout << "Ram Capacity : ";
        cin >> ramCapacity; 
        cout << "Ram Price : ";
        cin >> ramPrice; 
        cout << "\n";   

        //gunakan prosedur setter dari objek untuk mengisi atribut
        p[i].setName(processorName);
        p[i].setPrice(processorPrice);

        d[i].setType(diskType);
        d[i].setCapacity(diskCapacity);
        d[i].setPrice(diskPrice);

        
        r[i].setCapacity(ramCapacity);
        r[i].setPrice(ramPrice);

        
        pc[i].setP(p[i]);
        pc[i].setD(d[i]);
        pc[i].setR(r[i]);

        totalPrice = p[i].getPrice() + d[i].getPrice() + r[i].getPrice();
        pc[i].setTotalPrice(totalPrice);
            
    }

    //menampilkan spesifikasi pc
    for(i=0; i<n; i++){

        cout << "=====================" << endl <<  "  SPESIFIKASI PC " << (i+1) << endl << "=====================" << endl;
        pc[i].PrintPC();

        cout << "\n";
    }

    

    return 0;

}
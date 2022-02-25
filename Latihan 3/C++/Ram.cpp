/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <iostream>
#include <string>

using namespace std;

class Ram{

    private:
     
        int capacity;
        int price;

    public:

        Ram(){ //konstruktor kosong

        }

        //metode getter dan setter
        int getCapacity(){

            return this->capacity;
        }

        void setCapacity(int capacity){

            this->capacity = capacity;
        }

        int getPrice(){

            return this->price;
        }

        void setPrice(int price) {
            this->price = price;

        }

        void PrintRam(){ //untuk menampilkan atribut
            cout << "======= RAM =========" << endl;
            cout << " Capacity : " << getCapacity() << " GB" << endl;
            cout << " Price    : " << getPrice() << endl;
        }

        ~Ram(){ //destruktor

        }
};
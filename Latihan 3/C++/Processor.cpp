/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <iostream>
#include <string>

using namespace std;

class Processor{

    private:
     
        string name;
        int price;

    public:

        Processor(){ //konstruktor kosong

        }

        //metode getter dan setter
        string getName(){

            return this->name;
        }

        void setName(string name){

            this->name = name;
        }

        int getPrice(){

            return this->price;
        }

        void setPrice(int price) {
            this->price = price;

        }

        void PrintProcessor(){ //untuk menampilkan atribut
            cout << "===== PROCESSOR =====" << endl;
            cout << " Name  : " << getName() << endl;
            cout << " Price : " << getPrice() << endl;
        }

        ~Processor(){ //destruktor

        }
};
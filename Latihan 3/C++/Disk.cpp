/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <iostream>
#include <string>

using namespace std;

class Disk{

    //atribut
    private:
        string type;
        int capacity;
        int price;

    public:

        Disk(){ //konstruktor kosong

        }

        //metode getter dan setter
        string getType(){

            return this->type;
        }

        void setType(string type){

            this->type = type;
        }

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

        void PrintDisk(){ //untuk menampilkan atribut
            cout << "======= DISK ========" << endl;
            cout << " Type     : " << getType() << endl;
            cout << " Capacity : " << getCapacity() << " GB" << endl;
            cout << " Price    : " << getPrice() << endl;
        }

        ~Disk(){ //destruktor

        }
};
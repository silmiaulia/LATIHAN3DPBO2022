/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

#include <iostream>
#include <string>

using namespace std;

class Pc{

    private:

        Processor p;
        Disk d;
        Ram r;
        int totalPrice;

    public:

        Pc(){ //konstruktor kosong

        }

        //metode getter dan setter

        Processor getP(){
            return this->p;
        }

        void setP(Processor p){
            this->p = p;
        }

        Disk getD(){
            return this->d;
        }

        void setD(Disk d){
            this->d = d;
        }

        Ram getR(){
            return this->r;
        }

        void setR(Ram r){
            this->r = r;
        }

        int getTotalPrice(){
            return this->totalPrice;
        }

        void setTotalPrice(int totalPrice){
            this->totalPrice = totalPrice;
        }

        void PrintPC(){ //untuk menampilkan spesifikasi pc
            
            this->p.PrintProcessor();
            this->d.PrintDisk();
            this->r.PrintRam();
            cout << "=====================" << endl;
            cout << "Total Price : " << getTotalPrice() << endl;
        }

        ~Pc(){ //destruktor
            
        }

};
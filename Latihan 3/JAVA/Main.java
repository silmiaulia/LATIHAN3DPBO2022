/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

import java.util.*;

public class Main{

    public static void main(String[] args){


        int n =0, i = 0; //inisialisasi variabel untuk jumlah input dan iterasi

        System.out.print("Masukan Jumlah PC : "); 
        
        Scanner sc = new Scanner(System.in); //untuk scanner

        //meminta jumlah input PC
        try{

            n = Integer.parseInt(sc.nextLine());

        }catch(Exception e){}

    
        //membuat array objek 
        Processor[] p = new Processor[n];
        Disk[] d = new Disk[n];
        Ram[] r = new Ram[n];
        PC[] pc = new PC[n];


        for(i=0; i<n; i++){

            int processorPrice = 0;
            int diskPrice = 0;
            int ramPrice = 0;
            int diskCapacity = 0;
            int ramCapacity = 0;
            int totalPrice = 0;
            String processorName = "";
            String diskType = "";

            System.out.println("INPUT SPESIFIKASI PC " + (i+1));
            
            //melakukan input spesifikasi PC
            System.out.print("Processor Name : ");
            try{

                processorName = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Processor Price : ");
            try{

                processorPrice = Integer.parseInt(sc.nextLine());

            }catch(Exception e){}

            System.out.print("Disk Type : ");
            try{

                diskType = sc.nextLine();

            }catch(Exception e){}

            System.out.print("Disk Capacity : ");
            try{

                diskCapacity = Integer.parseInt(sc.nextLine());

            }catch(Exception e){}

            System.out.print("Disk Price : ");
            try{

                diskPrice = Integer.parseInt(sc.nextLine());

            }catch(Exception e){}

            System.out.print("Ram Capacity : ");
            try{

                ramCapacity = Integer.parseInt(sc.nextLine());

            }catch(Exception e){}

            System.out.print("Ram Price : ");
            try{

                ramPrice = Integer.parseInt(sc.nextLine());

            }catch(Exception e){}


            System.out.println();
            
            //instantiation
            p[i] = new Processor(); 
            d[i] = new Disk(); 
            r[i] = new Ram(); 
            pc[i] = new PC(); 

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
        

        //menampilkan data sepsifikasi PC
        for(i=0; i<n; i++){
            System.out.println("=====================");
            System.out.println("  SPESIFIKASI PC " + (i+1));
            System.out.println("=====================");
            pc[i].PrintPC();

            System.out.println();
        }
        
    }
}
/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

public class Ram{

    //atribut private 
    private int price = 0;
    private int capacity = 0;


    public Ram(){ //konstruktor kosong

    }

    //metode getter dan setter
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


    //untuk print atribut kelas 
    public void PrintRam(){

        System.out.println("======= RAM =========");
        System.out.println(" Capacity : " +  getCapacity() + " GB");
        System.out.println(" Price    : " + getPrice());
        
    } 

}
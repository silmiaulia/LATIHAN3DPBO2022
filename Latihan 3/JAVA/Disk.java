/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

public class Disk{

    //atribut private 
    private int price = 0;
    private int capacity = 0;
    private String type = "";


    public Disk(){ //konstruktor kosong

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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

    //untuk print atribut kelas 
    public void PrintDisk(){

        System.out.println("======= DISK ========");
        System.out.println(" Type     : " + getType());
        System.out.println(" Capacity : " + getCapacity() + " GB");
        System.out.println(" Price    : " + getPrice());
        
    } 

}
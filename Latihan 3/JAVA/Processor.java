/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

public class Processor{

    //atribut private  
    private int price = 0;
    private String name = "";
    
    public Processor(){ //konstruktor kosong

    }

    //metode getter dan setter
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


    //untuk print atribut kelas 
    public void PrintProcessor(){

        System.out.println("===== PROCESSOR =====");
        System.out.println(" Name  : " + getName());
        System.out.println(" Price : " + getPrice());
        
    } 

}
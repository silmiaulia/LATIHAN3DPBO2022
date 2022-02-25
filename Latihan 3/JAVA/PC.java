/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

public class PC{

    //atribut private 

    private Processor p = new Processor();
    private Disk d = new Disk();
    private Ram r = new Ram();
    private int totalPrice = 0;


    public PC(){ //konstruktor kosong

    }

    //metode getter dan setter
	public Processor getP() {
		return this.p;
	}

	public void setP(Processor p) {
		this.p = p;
	}

	public Disk getD() {
		return this.d;
	}

	public void setD(Disk d) {
		this.d = d;
	}

	public Ram getR() {
		return this.r;
	}

	public void setR(Ram r) {
		this.r = r;
	}

    public int getTotalPrice(){
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    //untuk print spesifikasi PC 
    public void PrintPC(){

        this.p.PrintProcessor();
        this.d.PrintDisk();
        this.r.PrintRam();
        System.out.println("=====================");
        System.out.println("Total Price : " + getTotalPrice());
        
    } 

}
<?php
/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

class PC{

    //atribut private 
    private $p;
    private $d;
    private $r;
    private $totalPrice;


    public function __construct(){ //konstruktor kosong

        $this->p = new Processor();
        $this->d = new Disk();
        $this->r = new Ram();
    }

    //metode getter dan setter

    public function getP() {
		return $this->p;
	}

	public function setP($p) {
		$this->p = $p;
	}

    public function getD() {
		return $this->d;
	}

	public function setD($d) {
		$this->d = $d;
	}

    public function getR() {
		return $this->r;
	}

	public function setR($r) {
		$this->r = $r;
	}

    public function getTotalPrice() {
		return $this->totalPrice;
	}

	public function setTotalPrice($totalPrice) {
		$this->totalPrice = $totalPrice;
	}

    //untuk print informasi spesifikasi pc
    public function PrintPC(){
        echo "=====================" . "<br/>";
        echo "  SPESIFIKASI PC ". "<br/>";
        echo "=====================" . "<br/>";
        $this->p->PrintProcessor();
        $this->d->PrintDisk();
        $this->r->PrintRam();

        echo "=====================". "<br/>";
        echo "Total Price : ". $this->getTotalPrice()."<br/>";
        
    } 
    
	public function __destruct(){ //destruktor
		
	}
}

?>
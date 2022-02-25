<?php
/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


class Ram{

    //atribut private 
    private $capacity;
    private $price;

    public function __construct(){ //konstruktor kosong

    }

    //metode getter dan setter

    public function getCapacity() {
		return $this->capacity;
	}

	public function setCapacity($capacity) {
		$this->capacity = $capacity;
	}

    public function getPrice() {
		return $this->price;
	}

	public function setPrice($price) {
		$this->price = $price;
	}

    //untuk print atribut kelas 
    public function PrintRam(){
        echo "======= RAM ========="."<br/>";
        echo " Capacity     : ". $this->getCapacity(). " GB"."<br/>";
        echo " Price : ". $this->getPrice()."<br/>";
        
    } 
    
	public function __destruct(){ //destruktor
		
	}
}

?>
<?php
/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

class Processor{

    //atribut private 
    private $name;
    private $price;

    public function __construct(){ //konstruktor kosong

    }

    //metode getter dan setter
	public function getName() {
		return $this->name;
	}

	public function setName($name) {
		$this->name = $name;
	}

    public function getPrice() {
		return $this->price;
	}

	public function setPrice($price) {
		$this->price = $price;
	}

    //untuk print atribut kelas 
    public function PrintProcessor(){
        echo "===== PROCESSOR ====="."<br/>";
        echo " Name  : ". $this->getName()."<br/>";
        echo " Price : ". $this->getPrice()."<br/>";
        
    } 

	public function __destruct(){ //destruktor
		
	}
}

?>
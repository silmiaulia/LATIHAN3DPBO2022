<?php
/* Saya Silmi Aulia Rohmah mengerjakan Latihan 3 DPBO 2022 C1 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

//include file class 
include ("Processor.php"); 
include ("Disk.php"); 
include ("Ram.php"); 
include ("PC.php"); 

//membuat objek untuk 
$p = new Processor(); 
$d = new Disk(); 
$r = new Ram(); 
$pc = new PC(); 

//mengisi atribut dengan metode set
$p->setName("AMD Ryzen 7");
$p->setPrice(3210000);

$d->setType("SSD");
$d->setCapacity(128);
$d->setPrice(210000);

$r->setCapacity(8);
$r->setPrice(550000);

$pc->setP($p);
$pc->setD($d);
$pc->setR($r);

//meanmpilkan data produk

$totalPrice = $p->getPrice() + $d->getPrice() + $r->getPrice();
$pc->setTotalPrice(3970000);

$pc->PrintPC()
?>
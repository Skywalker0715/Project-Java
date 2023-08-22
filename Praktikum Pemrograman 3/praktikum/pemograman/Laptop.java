/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

/**
 *
 * @author Dina
 */
 class Laptop {
     String hidupkanLaptop(String pemilik, String merk) {
	    return "hidupkan Laptop"+merk+" milik"+pemilik;
	 	}
	 	
	String matikanLaptop(String pemilik, String merk) {
	    return "Matikan Laptop"+merk+" milik "+pemilik;
	}
	
	void restartLaptop(){
	    System.out.println(matikanLaptop("Rissa", "Lenovo"));
	    System.out.println(hidupkanLaptop("Rissa", "Lenovo"));
	}
}

   class BelajarJava {
    public static void main(String args[]) {
        Laptop laptopAnto = new Laptop();
        laptopAnto.restartLaptop();
    }
  }



    


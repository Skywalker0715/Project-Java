/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

/**
 *
 * @author Lenovo1
 */
class Smartphone {
    // Attribute
    private String merk;
    private int ukuranLayar;
    private int harga;
    
   // constructor
    public Smartphone(String merk, int ukuranLayar, int harga){
       this.merk = merk;
       this.ukuranLayar = ukuranLayar;
       this.harga = harga;
    }
    
    //untuk mengambil nilai atribut objek
     public String getMerk(){
         return merk;
     }
     public int getukuranLayar(){
         return ukuranLayar;
     }
     public int getHarga(){
         return harga;
     }
     
       // untuk mengubah nilai atribut objek
     public void setMerk(String merk) {
          this.merk = merk;
     }

     public void setUkuranLayar(int ukuranLayar) {
          this.ukuranLayar = ukuranLayar;
     }

     public void setHarga(int harga) {
          this.harga = harga;
     }

    // Method untuk menampilkan informasi objek
    public void displayInfo() {
    System.out.println("Merk smartphone: " + merk);
    System.out.println("Ukuran layar: " + ukuranLayar + " inci");
    System.out.println("Harga: Rp" + harga);
    } 
}
    public class Main {
    public static void main(String[] args) {
        //buat objek dari class smartphone
    Smartphone smartphone1 = new Smartphone("Samsung Galaxy S21", 6, 14990000);
    Smartphone smartphone2 = new Smartphone("Xiaomi Redmi 9T", 7, 1899000);

    // Tampilkan informasi objek menggunakan method displayInfo()
    System.out.println("Informasi smartphone 1:");
    smartphone1.displayInfo();

    System.out.println();

    System.out.println("Informasi smartphone 2:");
    smartphone2.displayInfo();

    }
}

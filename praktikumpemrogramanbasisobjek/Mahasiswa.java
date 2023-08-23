/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;


/**
 *
 * @author Lenovo1
 */
public class Mahasiswa {
     //attribute
     private String nama;
     private String hobi;
     private String fakultas;
     private String Prodi;
    
     //constructor
     public Mahasiswa(String nama, String hobi, String Prodi, String fakultas){
        this.nama = nama;
        this.hobi = hobi;
        this.Prodi = Prodi;
        this.fakultas = fakultas;
}
    //method
       public void cetakHasil(){
           System.out.println("Nama : "+this.nama);
           System.out.println("Hobi : "+this.hobi);
           System.out.println("Prodi : "+this.Prodi);
           System.out.println("Fakultas : "+this.fakultas);
       }
      
       public static void main(String[] args) {
        //Create an object of class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andy","Membaca", "informatika","Sains Dan Teknologi" );
        Mahasiswa mahasiswa2 = new Mahasiswa("David", "Bermain Game", "Akuntansi", "Bisnis Dan Akuntansi");
        Mahasiswa mahasiswa3 = new  Mahasiswa("Wiliam", "Bernyanyi", "Psikologi", "Humaniora Dan Ilmu Pendidikan");
        
        //Call method from object
        mahasiswa1.cetakHasil();
        mahasiswa2.cetakHasil();
        mahasiswa3.cetakHasil();
    }
}

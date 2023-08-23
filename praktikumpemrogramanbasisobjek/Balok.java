/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

/**
 *
 * @author Lenovo1
 */
public class Balok {
    
    //method ini akan ditampilkan jika garbage collection bekerja
    public void finalize(){
        System.out.println("objek yang tidak terpakai sudah dibersihkan");
    }
    
    public static void main(String[] args) {
        Runtime RT =Runtime.getRuntime();
        System.out.println("jumlah memori awal : "+RT.totalMemory());
        
        Balok objek1 = new Balok(); //Block Satu
        Balok objek2 = new Balok(); //Block Dua Block objek3 objek1; //objek3 Mengembalikan Nilai Objekl
        Balok objek3 = objek1;
        objek1 = null; 
        objek2 = null;
        System.out.println("Jumlah Memori Yeng Tersedia Sebelum di GC: "+RT.freeMemory());
        System.gc();
        System.out.println("=============================================");
        System.out.println("Jumlah Memori Yeng Tersedia Setelah di GC: "+RT.freeMemory());
    }
}

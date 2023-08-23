/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

abstract class Hewan {
    String nama;
    
    public abstract void habitatHewan();
    
    public void namaHewan() {
        System.out.println("\nMethod di dalam abstract class Hewan");
        System.out.println("Nama hewan: " + nama);
    }
}

class Karnivora extends Hewan {
    String habitat;
    
    public void habitatHewan() {
        System.out.println("\nMethod di dalam class Karnivora");
        System.out.println("Habitat hewan: " + habitat);
    }
}

public class TryAbstractClass1 {
     public static void main(String[] args) {
     System.out.println("\n** MENERAPKAN PENGGUNAAN ABSTRACT CLASS #1 **");
        
        Karnivora singa = new Karnivora();
        singa.nama = "Singa";
        singa.habitat = "Hutan";
        
        singa.namaHewan();
        singa.habitatHewan();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;



/**
 *
 * @author Lenovo1
 */
public class Kesehatan {
    
    public static void main(String[] args) {
    try{
     cekKesehatan();
       }
     catch(NullPointerException e)
     {
     System.out.println("Maaf, terjadi kesalahan dalam proses cek kesehatan.");
     }
     finally
     {
     System.out.println("Proses cek kesehatan selesai.");
   }
   }
    public static void cekKesehatan() throws NullPointerException {
    System.out.println("Memeriksa tekanan darah...");
    System.out.println("Memeriksa kadar gula darah...");
    System.out.println("Memeriksa berat badan...");
    System.out.println("Memeriksa tinggi badan...");
   
    
    // lakukan pengecekan kondisi kesehatan berdasarkan hasil pemeriksaan
    throw new NullPointerException("Hasil pemeriksaan menunjukkan adanya masalah kesehatan.");
}


    
}

    

    




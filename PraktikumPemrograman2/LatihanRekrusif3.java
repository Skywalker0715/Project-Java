/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

/**
 *
 * @author Dina
 */
public class LatihanRekrusif3 {
    
    public static void deretRekursifProsedur(int n){
        if(n>=15){
            System.out.print(n);
            n = n-2;
            //Rekursif
            deretRekursifProsedur(n);
        }
    }
    
    //Rekursif (Metode - Fungsi)
     public static int deretRekursifFungsi(int n){
        if(n>=15){
            System.out.print(n);
            n = n-2;
            //Rekursif
            deretRekursifFungsi(n);
        }
        return n;
    }
    
      public static void main(String[] args) {
        int angka = 99;
	    
              System.out.print("Hasil Dengan REKURSIF Metode - Prosedur: ");
		deretRekursifProsedur(angka);
		
		System.out.println();
		
		
		System.out.print("Hasil Dengan REKURSIF Metode - Fungsi: ");
		deretRekursifFungsi(angka);
	}
    
}

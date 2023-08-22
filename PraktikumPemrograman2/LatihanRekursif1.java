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
public class LatihanRekursif1 {
    
     public static void deretRekursifProsedur(int num){
        if(num<=81){
            System.out.print(num);
            num = num + num*2;
            //Rekursif
            deretRekursifProsedur(num);
        }
    }
    
    //Rekursif (Metode - Fungsi)
     public static int deretRekursifFungsi(int num){
        if(num<=81){
            System.out.print(num);
            num = num+num*2;
            //Rekursif
            deretRekursifFungsi(num);
        }
        return num;
    }
    
      public static void main(String[] args) {
        int num = 3;
	    
              System.out.print("Hasil Dengan REKURSIF Metode Prosedur: ");
		deretRekursifProsedur(num);
		
		System.out.println();
		
		
		System.out.print("Hasil Dengan REKURSIF Metode Fungsi: ");
		deretRekursifFungsi(num);
	}
}

    
    
    
    
    

    
    


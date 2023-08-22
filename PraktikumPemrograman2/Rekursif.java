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
public class Rekursif {
     
   //Metode - Prosedur
    public static void kelipatan5Prosedur(int angkaLima){
        System.out.print("Hasil Dengan Metode - Prosedur: ");
        for(int i=angkaLima ; i<=50 ; i=i+angkaLima){
		    System.out.print(i+ " ");
		}
    }
    
    //Metode - Fungsi
    public static int kelipatan5Fungsi(int angkaLima){
        System.out.print("Hasil Dengan Metode - Fungsi: ");
        for(int i=angkaLima ; i<=50 ; i=i+angkaLima){
		    System.out.print(i+ " ");
		}
		
		return angkaLima;
    }
    
    //Rekursif (Metode - Prosedur)
    public static void kelipatan5RekursifProsedur(int angkaLima){
        if(angkaLima<=50){
            System.out.print(angkaLima+" ");
            angkaLima = angkaLima + 5;
            //Rekursif
            kelipatan5RekursifProsedur(angkaLima);
        }
    }
    
    //Rekursif (Metode - Fungsi)
    public static int kelipatan5RekursifFungsi(int angkaLima){
        if(angkaLima<=50){
            System.out.print(angkaLima+" ");
            angkaLima = angkaLima + 5;
            //Rekursif
            kelipatan5RekursifFungsi(angkaLima);
        }
        return angkaLima;
    }
    
	public static void main(String[] args) {
	    int angka = 5;
	    //Memanggil Prosedur
		kelipatan5Prosedur(angka);
		
		System.out.println();
		
		//Memanggil Fungsi
		kelipatan5Fungsi(angka);
		System.out.println();
		
		//Menggunakan Rekursif Prosedur
		System.out.print("Hasil Dengan REKURSIF Metode - Prosedur: ");
		kelipatan5RekursifProsedur(angka);
		
		System.out.println();
		
		//Menggunakan Rekursif Fungsi
		System.out.print("Hasil Dengan REKURSIF Metode - Fungsi: ");
		kelipatan5RekursifFungsi(angka);
	}
}
    


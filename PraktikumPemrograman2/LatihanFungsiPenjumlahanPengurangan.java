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
public class LatihanFungsiPenjumlahanPengurangan {
    
  public static String penjumlahan(int angka1, int angka2,String kata1){
      //proses
      int hasil1 = angka1 + angka2;
      
      //konveri hasil int tadi ke string
      String konversi = String.valueOf(hasil1);
      String kalimat = kata1 + konversi;
      
      return kalimat;
   }
   public static int pengurangan(int angka3, int angka4,String kata2){
       //proses
       int hasil2 = angka3 - angka4;
       
       //konversi hasil int tadi ke string
       String konversi = String.valueOf(hasil2);
       String kalimat  = kata2 + konversi;
       
       return hasil2;
      }
     public static void main(String[]args){
         int a = 20;
         int b = 10;
         String kata1 = " ";
         String kata2 = " ";
         
         //proses
         String hasilpenjumlahan = penjumlahan(a,b,kata1);
         System.out.println("hasil penjumlhan = "+hasilpenjumlahan);
         
         int hasilpengurangan = pengurangan(a,b,kata2);
         System.out.println("hasil pengurangan  = "+hasilpengurangan);
         
     }
     
        
    }
 
         
         
     
        
      
        
        

    
        



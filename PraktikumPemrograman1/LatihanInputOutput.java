/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemrograman1;

import java.util.Scanner;



/**
 *
 * @author Dina
 */
public class LatihanInputOutput {
      public static void main(String[] args) {
         Scanner masuk = new Scanner(System.in);
         
         int harga;
         int jumlahbarang;
         int total;
         int diskon;
         
          System.out.println("harga barang");
          harga = masuk.nextInt();
          System.out.println("jumlah barang ");
          jumlahbarang = masuk.nextInt();
          total = jumlahbarang*harga;
          
          if (total>=750000 && total<=1500000) {
              diskon = total*35/100;
              total = total-diskon;
              System.out.println("selamat anda mendapatkan diskon 35% ");
              System.out.println(" jadi totalnya ="+total);
          }
          else if (total>= 2500000 && total<=4500000){
              diskon = total*50/100;
              total = total-diskon;
              System.out.println("selamat anda mendapatkan diskon 35% ");
              System.out.println(" jadi totalnya ="+total);
          }
          else {
              System.out.println("anda tidak mendapatkan diskon");
              
           
                    
              
          }
          
          }
}
  


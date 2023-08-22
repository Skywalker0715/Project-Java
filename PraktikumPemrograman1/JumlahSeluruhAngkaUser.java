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
public class JumlahSeluruhAngkaUser {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          int total = 0;
        
         System.out.print("Masukkan jumlah angka yang dimasukkan = ");
        int jumlahAngka = input.nextInt();
        
        
        if (jumlahAngka == 0) {
            System.out.println(" out :(");
            System.exit(0);
        }
        
        
        for (int i = 1; i <= jumlahAngka; i++) {
           
            System.out.print("Masukkan angka ke " + i + ": ");
            int angka = input.nextInt();
            
            total = total + angka;
        }
        
        
        System.out.println("Total seluruh angka yang diinput adalah: " + total);
    }
}
    

        
       
        
    
         
      
              
    
  
   
  
    


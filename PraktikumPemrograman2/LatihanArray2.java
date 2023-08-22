/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

import java.util.Scanner;

/**
 *
 * @author Dina
 */
public class LatihanArray2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int nilai[] = new int [10];
        int terbesar = nilai[0];
        
        for(int i=0;i<nilai.length;i++){
            System.out.print ("Masukkan NIlai Indeks ke-"+i+": ");
                nilai [i]=input.nextInt();
                
          }
         
        for (int i = 0; i < nilai.length; i++) {
            if (nilai [i]>terbesar){terbesar = nilai[i];
          }
           
    }     
          System.out.println("angka terbesar adalah = " +terbesar);   
         }
}
        
        
        
        
    


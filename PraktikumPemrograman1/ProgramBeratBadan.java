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
public class ProgramBeratBadan {
     public static void main(String[] args) {
         //input
         Scanner masuk = new Scanner(System.in);
         int a;
         a= masuk.nextInt();
         int b;
         b= masuk.nextInt();
         int c;
         c= b/100*b/100;
         int d;
         d= a/c;
        
                
        
         //tampilan
         if (d < 18.5){
             System.out.println(d+", anda termasuk berbadan terlalu kurus ");
         }
         if (d >= 18.5 && d <= 25){
             System.out.println(d+", anda termasuk berbadan langsing ");
             
         if (d > 25 ){
             System.out.println(d+", anda termasuk berbadan gemuk ");
         }
         else {
             System.out.println("input salah");
         }
             
         }
  
     }

}

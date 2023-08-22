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
public class LatihanInputOutput3 {
    public static void main(String[] args) {
        float tinggi, berat;
        String a;
        
         Scanner masuk = new Scanner(System.in);
         
         System.out.println("masukkan tinggi : ");
         tinggi = masuk.nextFloat();
         
         System.out.println("masukkan berat : ");
         berat = masuk.nextFloat();
         
         float hitung = (tinggi/100) * (tinggi/100) ;
         float BMI = berat / hitung ;
         
         System.out.println(" total BMI : "+BMI);
         
         if (BMI < 18.5){
             a ="kurus ";
             System.out.println("keterangan : "+a);
         }
         else if (BMI >= 18.5 && BMI <=25){
             a = " langsing ";
             System.out.println("keterangan :"+a);
            
        }
         else {
             a = "gemuk";
             System.out.println("keterangan :"+a);
         }
         
         }
         
             
         }
    
    
      
        



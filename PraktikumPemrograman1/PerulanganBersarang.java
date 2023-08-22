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
public class PerulanganBersarang {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int angka = 1;
        
        System.out.print("Masukkan panjang angka: ");
        int panjangAngka = input.nextInt();
        
        for (int i = 1; i <= panjangAngka; i++) {
            angka = angka * 10;
        }
        
        
        do {
            System.out.println(angka);
            angka = angka / 10;
        }
         while (angka >= 1);
    }
}




 

             
         
         
             
        
    



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
public class LatihanRekursif5 {
    
    public static int faktorial(int angka){
        if(angka == 0 || angka == 1)
            return 1;
        else
            return angka*faktorial(angka-1);
    }
    
    public static void main(String[]args){
        int angka, hasil;
        
        System.out.println("Masukan Angka = ");
        
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        System.out.println(" ");
        hasil = faktorial(angka);
        System.out.println(angka+"!="+hasil);
    }
   
 }

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
public class ProgramMencetakNama {
     public static void main(String[] args) {
         //masukkan
        Scanner masuk = new Scanner(System.in);
        System.out.println("Nama Anda = ");
        String nama = masuk.nextLine();
        System.out.println("Tahun Kelahiran Anda = ");
        int umur = masuk.nextInt();
        
        //tampilan
        if (umur>=1944 && umur<=1964){
            System.out.println(nama+", Berdasarkan tahun lahir anda tergolong BabyBoomer" );
        }
        if (umur>=1965 && umur<=1979){
            System.out.println(nama+", Berdasarkan tahun lahir anda tergolong Generasi X");
        }
        if (umur>=1980 && umur<=1994){
            System.out.println(nama+", Berdasarkan tahun lahir anda tergolong Generasi Y");
        }
        if (umur>=1995 && umur<=2015){
            System.out.println(nama+", Berdasarkan tahun lahir anda tergolong Generasi Z");
        }
        else {
            System.out.println("Input Salah");
        }
    }
}

        
       
        
        
         
         
     


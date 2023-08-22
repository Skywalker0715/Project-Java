/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

import java.util.Scanner;

/**
 *
 * @author Lenovo1
 */
public class LuasPersegi {
    public static void main(String[]args){
        //Variable inputan
        Scanner input = new Scanner(System.in);
        System.out.println ("Selamat Datang Di Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
        System.out.print("\nTentukan Pilihan Anda (Masukkan Angka) = ");
        int pilihan=input.nextInt();
        double angka1;
        double angka2;
        //Variable Output
        switch (pilihan){
            case 1 :
                System.out.print ("Angka pertama untuk dihitung ? ");
                angka1 = input.nextDouble();
                System.out.print ("Angka kedua untuk dihitung ? ");
                angka2 = input.nextDouble();
                double hasilPenjumlahan = angka1 + angka2;
                System.out.println("Hasil Penjumlahan "+angka1+" + "+angka2+" = "+hasilPenjumlahan);
                break;
            case 2 :
                System.out.print ("Angka pertama untuk dihitung ? ");
                angka1 = input.nextDouble();
                System.out.print ("Angka kedua untuk dihitung ? ");
                angka2 = input.nextDouble();
                double hasilPengurangan = angka1-angka2;
                System.out.println("Hasil Pengurangan "+angka1+" - "+angka2+" = "+hasilPengurangan);
                break;
            case 3 :
                System.out.print ("Angka pertama untuk dihitung ? ");
                angka1 = input.nextDouble();
                System.out.print ("Angka kedua untuk dihitung ? ");
                angka2 = input.nextDouble();
                double hasilPerkalian = angka1*angka2;
                System.out.println("Hasil Perkalian "+angka1+" * "+angka2+" = "+hasilPerkalian);
                break;
            case  4 :
                System.out.print ("Angka pertama untuk dihitung ? ");
                angka1 = input.nextDouble();
                System.out.print ("Angka kedua untuk dihitung ? ");
                angka2 = input.nextDouble();
                double hasilPembagian = angka1/angka2;
                System.out.println("Hasil Pembagian "+angka1+" / "+angka2+" = "+hasilPembagian);
                break;
            default :
                System.out.println("Pilihan Anda Salah");
                break;
        }
    }
        
    }
    




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

import java.util.Scanner;

/**
 *
 * @author Lenovo1
 */
public class Biodata {
    static String[] isiArrayFunc(){
        Scanner input = new Scanner(System.in);
        
        //membuat fungsi
        String Array[] = new String[5];
        System.out.print("Masukkan NIM = ");
        Array[0] = input.next();
        System.out.print("Masukkan nama = ");
        Array[1] = input.next();
        System.out.print("Masukkan jenis kelamin = ");
        Array[2] = input.next();
        System.out.print("Masukkan program studi = ");
        Array[3] = input.next();
        System.out.print("Masukkan fakultas = ");
        Array[4] = input.next();
        
        return Array;
    }
    
    static void isiArrayPros(){
        Scanner input = new Scanner(System.in);
        //membuat prosedur
        String Array[] = new String[5];
        System.out.print("Masukan NIM = ");
        Array[0] = input.next();
        System.out.print("Masukan nama = ");
        Array[1] = input.next();
        System.out.print("Masukan jenis kelamin = ");
        Array[2] = input.next();
        System.out.print("Masukan program studi = ");
        Array[3] = input.next();
        System.out.print("masukan fakultas = ");
        Array[4] = input.next();
        
        System.out.println("Nim\t\t = "+Array[0]);
        System.out.println("Nama\t\t = "+Array[1]);
        System.out.println("Jenis Kelamin\t = "+Array[2]);
        System.out.println("Program Studi\t = "+Array[3]);
        System.out.println("Fakultas\t = "+Array[4]);

    }
             
   public static void main(String[] args){
       System.out.println("Aplikasi Menampilkan Biodata Mahasiswa");
       //memanggil fungsi
       System.out.println("---Function---");
       String Array[] = isiArrayFunc();
       System.out.println("Nim\t\t = "+Array[0]);
       System.out.println("Nama\t\t = "+Array[1]);
       System.out.println("Jenis Kelamin\t = "+Array[2]);
       System.out.println("Program Studi\t = "+Array[3]);
       System.out.println("Fakultas\t = "+Array[4]);

       //memanggil prosedur
       System.out.println("\n---Prosedur---");
       isiArrayPros();
   }
    }


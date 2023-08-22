/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

import java.util.Scanner;

/**
 *
 * @author Dina
 */
public class Biodata {
    static String[] isiArrayFunc(){
        Scanner input = new Scanner (System.in);
        
        String array[] = new String [5];
        
        System.out.print("Masukkan NIM = ");
        array[0] = input.next();
        System.out.print("Masukkan nama = ");
        array[1] = input.next();
        System.out.print("Masukkan jenis kelamin = ");
        array[2] = input.next();
        System.out.print("Masukkan program studi = ");
        array[3] = input.next();
        System.out.print("Masukkan fakultas = ");
        array[4] = input.next();
        
        return array;
    }
    
    static void isiArrayPros(){
        Scanner input = new Scanner (System.in);
        
        String array[] = new String [5];
        
        System.out.print("Masukkan NIM = ");
        array[0] = input.next();
        System.out.print("Masukkan nama = ");
        array[1] = input.next();
        System.out.print("Masukkan jenis kelamin = ");
        array[2] = input.next();
        System.out.print("Masukkan program studi = ");
        array[3] = input.next();
        System.out.print("Masukkan fakultas = ");
        array[4] = input.next();
        
        System.out.println("Nim\t\t = "+array[0]);
        System.out.println("Nama\t\t = "+array[1]);
        System.out.println("Jenis Kelamin\t = "+array[2]);
        System.out.println("Program Studi\t = "+array[3]);
        System.out.println("Fakultas\t = "+array[4]);
    }
    
    public static void main(String[] args) {
        System.out.println("---Function---");
        String[] array = isiArrayFunc();
        System.out.println("Nim\t\t = "+array[0]);
        System.out.println("Nama\t\t = "+array[1]);
        System.out.println("Jenis Kelamin\t = "+array[2]);
        System.out.println("Program Studi\t = "+array[3]);
        System.out.println("Fakultas\t = "+array[4]);
        
        System.out.println("\n---Prosedur---");
        isiArrayPros();
    }
    
}

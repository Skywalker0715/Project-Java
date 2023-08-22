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
public class PraktikumPemograman3 {
    public static void BioD(String[]Bio){
        for ( int i = 0; i<5; i++)
            System.out.println(Bio[i]);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] Bio;
        String NIM, Nama, JK, Prodi, Fakultas;
        Bio = new String [5];
        System.out.print ("Masukkan NIM Anda : ");
        Bio [0] = input.next();
        System.out.print("Masukkan Nama Anda : ");
        Bio [1] = input.next();
        System.out.print("Masukkan Jenis Kelamin Anda : ");
        Bio [2] = input.next();
        System.out.print ("Masukkan Asal Prodi Anda : ");
        Bio [3] = input.next();
        System.out.print ("Masukkan Asal Fakultas Anda : ");
        Bio [4] = input.next();
        BioD (Bio);
    }
        
        
        
    }
    


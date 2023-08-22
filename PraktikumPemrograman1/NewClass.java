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
public class NewClass {
     public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int pilih;
        
         System.out.println("\n MENU");
         System.out.println(" 1.Luas persegi ");
         System.out.println(" 2.Luas persegi panjang ");
         System.out.println(" 3.menentukan nilai mahasiswa ");
         System.out.println(" 4.Panjang Angka ");
         System.out.println(" 5.jumlah angka yang dimasukan user");
         System.out.println(" 6.menentukan ganjil dan genap ");
         System.out.println(" 7.diskon belanja ");
         System.out.println(" 8.bunga uang ");
         System.out.println(" 9.menentukan berat badan ");
         System.out.println(" 0.keluar ");
         
         System.out.println(" Masukkan Pilihan Anda ");
         pilih = masuk.nextInt();
         
         switch(pilih) {
             case 1 : double sisi;
                      double luas;
                      
                      Scanner input = new Scanner(System.in);
                      System.out.println("===Menghitung luas persegi===");
                      System.out.println(" Masukkan sisi = ");
                      sisi = input.nextDouble();
                      
                      luas = sisi * sisi;
                      
                      System.out.println(" Luas persegi =" +luas);
                      break;
                      
             case 2 : double panjang;
                      double lebar;
                      double Luas;
                      
                      Scanner Scan = new Scanner(System.in);
                      System.out.println("===Menghitug luas persegi panjang===");
                      System.out.println(" Masukkan panjang  = ");
                      panjang = Scan.nextDouble();
                      System.out.println(" Masukkan lebar = ");
                      lebar = Scan.nextDouble();
                      
                      Luas = panjang * lebar;
                      System.out.println(" Luas Persegi panjang =" +Luas);
                      break;
                      
             case 3 : String nama, Nim;
                      final double n_tugas, n_kuis, n_uts, n_uas, n_akhir;
                      double grade;
                      
                      System.out.println("===Menghitung Nilai Mahasiswa===");
                      System.out.print("Masukan nama : ");
                      nama = masuk.nextLine();
                      System.out.print("Masukan NIM : ");
                      Nim = masuk.nextLine();
                      System.out.print("Nilai tugas : ");
                      n_tugas = masuk.nextInt();
                      System.out.print("Nilai kuis : ");
                      n_kuis = masuk.nextInt();
                      System.out.print("Nilai uts : ");
                      n_uts = masuk.nextInt();
                      System.out.print("Nilai uas : ");
                      n_uas = masuk.nextInt();
                      n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
                      
            if ( n_akhir >=85 && n_akhir <=100 )     {
                 grade = 'A';
        }    
                else if (n_akhir > 75 && n_akhir < 85){
                grade = 'B';
        }
                else if (n_akhir > 65 && n_akhir < 75){
                grade = 'C';
        }
                 else if (n_akhir > 50 && n_akhir < 65){
                grade = 'D';
        }
                else {
                grade = 'E';
        }
            if (grade == 'A' || grade == 'B' || grade == 'C'){
                System.out.println("\n"+nama+" dengan NIM "+Nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
                else {
                System.out.println("\n"+nama+" dengan NIM "+Nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
                break;
                
            }
             case 4 : int angka = 1;
        
                     System.out.print("Masukkan panjang angka: ");
                      int panjangAngka = masuk.nextInt();
        
                      for (int i = 1; i <= panjangAngka; i++) {
                      angka = angka * 10;
        }
        
        
                      do {
                      System.out.println(angka);
                      angka = angka / 10;
        }
                     while (angka >= 1);
                      break;
                      
             case 5 : int total = 0;
        
             System.out.print("Masukkan jumlah angka yang dimasukkan = ");
              int jumlahAngka = masuk.nextInt();
        
        
        if (jumlahAngka == 0) {
            System.out.println(" out :(");
            System.exit(0);
        }
        
        
        for (int i = 1; i <= jumlahAngka; i++) {
           
                System.out.print("Masukkan angka ke " + i + ": ");
                angka = masuk.nextInt();
            
            total = total + angka;
        }
        
        
           System.out.println("Total seluruh angka yang diinput adalah: " + total);
           break;
           
             case 6 : int a ;
                System.out.print("Masukkan sebuah bilangan : ");
                a = masuk.nextInt();
                if (a % 2 == 0) {
                System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
                System.out.print("Bilangan " + a + " adalah ganjil.\n");
                break;
                
    } 
             case 7 : int harga;
                int jumlahbarang;
                int diskon;
                int totalkeseluruhan;
        
                
                System.out.println("RENDY SAPUTRA");
                System.out.println("............................................");
                System.out.print ("harga barang ");
                harga = masuk.nextInt();
                System.out.print ("jumlah barang ");
                jumlahbarang = masuk.nextInt();
                totalkeseluruhan = jumlahbarang*harga;
        
            if (totalkeseluruhan>=500000 && totalkeseluruhan<=500000){
                diskon = totalkeseluruhan*5/100;
                totalkeseluruhan= totalkeseluruhan-diskon;
                System.out.println("anda dapat diskon 5%");
                System.out.println("totalkeseluruhan "+totalkeseluruhan);
        }
        else if (totalkeseluruhan>=1000000 && totalkeseluruhan<=1000000){
                diskon = totalkeseluruhan*10/100;
                totalkeseluruhan= totalkeseluruhan-diskon;
                System.out.println("anda dapat diskon 10%");             
        }
        else if (totalkeseluruhan>=1001000 && totalkeseluruhan<=2000000){
                diskon = totalkeseluruhan*15/100;
                totalkeseluruhan= totalkeseluruhan-diskon;
                System.out.println("anda dapat diskon 15%"); 
        }
        else if (totalkeseluruhan>=2000000 && totalkeseluruhan<=2000000){
                diskon = totalkeseluruhan*25/100;
                totalkeseluruhan= totalkeseluruhan-diskon;
                System.out.println("anda dapat diskon 25%"); 
        }
        else {
            diskon = totalkeseluruhan*0/100;
            totalkeseluruhan= totalkeseluruhan-diskon;
            System.out.println("TIDAK DAPAT DISKON ");  
            break;
        }
           
             case 8 : float uang = 1000000;
         int bunga = 10;
         
          for ( int i = 1; i<=10; i++) {
             uang = uang + ( uang*10/100);
             
             System.out.println("Uang setelah 10 tahun adalah = "+uang);
             break;
         }
          
             case 9 : float tinggi, berat;
                      
                     
         System.out.println("masukkan tinggi : ");
         tinggi = masuk.nextFloat();
         
         System.out.println("masukkan berat : ");
         berat = masuk.nextFloat();
         
         float hitung = (tinggi/100) * (tinggi/100) ;
         float BMI = berat / hitung ;
         
         System.out.println(" total BMI : "+BMI);
         
         if (BMI < 18.5){
            
             System.out.println("Langsing");
         }
         else if (BMI >= 18.5 && BMI <=25){
             System.out.println("Gemuk");
            
        }
         break;
         
        
             case 10 : System.exit(0);
        break;
        default : System.out.println("Exit");
         
         }
          
            
              
                
      

  
                      
                      
             
                       
                      
                      
                    
                     
                     
         }
         
                      
         }

         
            
            
     
        
          
      
        
       
       
             
         
         
         
         
         
             
         
         
         
         
     

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
public class MyAplikasi {
    public static void main(String[] args) {
        double Angka1,Angka2,Penjumlahan,Angka3,Angka4,Pengurangan,Angka5,Angka6,Perkalian, Angka7,Angka8,Pembagian;
      int pilihan = 0, Pilihan = 0;
      do {
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("#selamat datang pada MyAplikasi# ");
        System.out.println("============================");
        System.out.println(" 1.Operasi Matematika ");
        System.out.println(" 2. Bilangan Genap/Ganjil ");
        System.out.println(" 3. Diskon Belanja ");
        System.out.println(" 4. Penilaian Mahasiswa ");
        System.out.println(" 5.  Exit ");
        
       System.out.println("============================");
        
        System.out.print("Tentukan Pilihan Anda (PILIH No 1,2,3,4,5) = ");
        pilihan = Integer.valueOf(masuk.nextLine());
        
        switch(pilihan){
        case 1 :System.out.println("Pilihan menu   : ");
                System.out.println("1. Penjumlahan  ");
                System.out.println("2. Pengurangan  ");
                System.out.println("3. Perkalian    ");
                System.out.println("4. Pembagian    ");
                System.out.println("0. kembali      ");
                System.out.print("Masukan Pilihan Anda = ");
                Pilihan = Integer.valueOf(masuk.nextLine());
                
        switch(Pilihan){
        case 1 :System.out.print("Angka : ");
                Angka1 = masuk.nextDouble();
                System.out.print("Angka : ");
                Angka2 = masuk.nextDouble();
                Penjumlahan = Angka1 + Angka2 ;
                System.out.println(" Penjumlahan : " +Penjumlahan );    
        break;
        case 2 :System.out.print(" Angka : ");
                Angka3 = masuk.nextDouble();
                System.out.print(" Angka : ");
                Angka4 = masuk.nextDouble();
                Pengurangan = Angka3 - Angka4;
                System.out.println(" Pengurangan : " +Pengurangan );
       break;
                        
       case 3 :System.out.print(" Angka : ");
               Angka5 = masuk.nextDouble();
               System.out.print(" Angka : ");
               Angka6 = masuk.nextDouble();
               Perkalian = Angka5 * Angka6;
               System.out.println(" Perkalian : " +Perkalian );
       break;
       case 4 :System.out.print(" Angka : ");
               Angka7 = masuk.nextDouble();
               System.out.print(" Angka : ");
               Angka8 = masuk.nextDouble();
               Pembagian = Angka7 / Angka8;                                        
               System.out.println(" Pembagian : " +Pembagian );
        break;
        case 5 :  System.exit(0);
        break;
        default : System.out.println("Pilihan Tidak Ada ,Silahkan pilih angaka yang tersedia");
                    }break;
        case 2 : int a;
                Scanner scan = new Scanner(System.in);
                System.out.print("Masukkan sebuah bilangan : ");
                a = scan.nextInt();
                if (a % 2 == 0) {
                System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
                System.out.print("Bilangan " + a + " adalah ganjil.\n");
    } 

        case 3 :int harga;
                int jumlahbarang;
                int diskon;
                int totalkeseluruhan;
        
                Scanner input = new Scanner(System.in);
                System.out.println("RENDY SAPUTRA");
                System.out.println("............................................");
                System.out.print ("harga barang ");
                harga = input.nextInt();
                System.out.print ("jumlah barang ");
                jumlahbarang = input.nextInt();
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
        }

        case 4 :
                String nama , nim ;
                char grade ;
                final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
                System.out.println("===== Menghitung Nilai Mahasiswa=====");
                System.out.print("Masukan nama : ");
                nama = masuk.nextLine();
                System.out.print("Masukan NIM : ");
                nim = masuk.nextLine();
                System.out.print("Nilai tugas : ");
                n_tugas = masuk.nextInt();
                System.out.print("Nilai kuis : ");
                n_kuis = masuk.nextInt();
                System.out.print("Nilai uts : ");
                n_uts = masuk.nextInt();
                System.out.print("Nilai uas : ");
                n_uas = masuk.nextInt();
                n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
    if (n_akhir >= 85 && n_akhir <=100){
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
                System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
                else {
                System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        } 
    }  
                break;
                
                                      
        } while(pilihan > 0 && pilihan < 5);
}
}
           
        
    

      
        
        
        
         
        
        
        
        
        
        
               
        
        
        
    



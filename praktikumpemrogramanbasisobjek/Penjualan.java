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
public class Penjualan {
    static int cekharga(int item){
        int hargaBarang=0;
        if(item==1){
            hargaBarang = 150000;
        }
        else if(item==2){
            hargaBarang = 150000;
        }
        else if(item==3){
            hargaBarang = 300000;
        }
        else if(item==4){
            hargaBarang = 1500000;
        }
        else if(item==5){
            hargaBarang = 700000;
        }
        return hargaBarang;
    }
    static int hitungPembayaran(int totalBayar){
        int totPembayaran = 0;
        if((totalBayar>500000) && (totalBayar<1000000)){
            totPembayaran = totalBayar - (totalBayar*5/100);
        }
        else if((totalBayar>=1000000) && (totalBayar<1500000)){
            totPembayaran = totalBayar - (totalBayar*10/100);
        }
        else if((totalBayar>=1500000) && (totalBayar<2000000)){
            totPembayaran = totalBayar - (totalBayar*15/100);
        }
        else if((totalBayar>=2000000) && (totalBayar<2500000)){
            totPembayaran = totalBayar - (totalBayar*20/100);
        }
        else if(totalBayar>=2500000){
            totPembayaran = totalBayar - (totalBayar*25/100);
        }
        else{
             totPembayaran = totalBayar;
        }
        return totPembayaran;
    }
    
    public static void tampilanMenu(){
        //inputan Menu
        System.out.print("================================/n");
        System.out.print("Selamat datang , Silakan Pilih Menu diabawah ini");
        System.out.print(" 1. Mouse (150k) \n 2. Headset (150k) \n 3. Keyboard (300k) \n");
        System.out.print(" 4. Monitor (1500k) \n 5. Casing PC (700k) \n");
        System.out.print("=================================\n");   
    }
    
    public static void prosesBayar(int totBelanja, int countBarang){
        //Proses Pembayaran
        int totPembayaran = hitungPembayaran(totBelanja);
        System.out.print("Total Belanja Anda Sebanyak "+countBarang+" item Sejumlah : Rp. "+totPembayaran);
    }
    
    public static void main(String[] args) {
        Scanner dt = new Scanner (System.in);
        int input[] = new int[5];
        int totBayar[] = new int[5];
        int countBarang = 0;
        int totBelanja=0;
        
        System.out.print("Selamat Datang Di Toko Komputer XYZ\n");
        while(countBarang<5){
                //Pilihan Lanjutan Barang
                System.out.print("Apakah Anda Akan Membeli Barang (0 / 1):  ");
                int pil = dt.nextInt();
                if(pil==0){
                    if(countBarang==0){
                        System.out.print("Anda Harus Belanja Minimal 1 Barang.\n");
                        tampilanMenu();
                        System.out.print("Silahkan Masukan Pilihan Anda : ");
                        input[countBarang] = dt.nextInt();
                        //Penentuan Harga
                        totBayar[countBarang] = cekharga(input[countBarang]);
                        totBelanja = totBelanja + totBayar[countBarang];
                        countBarang++;
                    }
                    System.out.print("Terima Kasih\n");
                    prosesBayar(totBelanja, countBarang);
                    break;
                }
                else{
                    tampilanMenu();
                    System.out.print("Silahkan Masukan Pilihan Anda : ");
                    input[countBarang] = dt.nextInt();
                    //Penentuan Harga
                    totBayar[countBarang] = cekharga(input[countBarang]);
                    totBelanja = totBelanja + totBayar[countBarang];
                    countBarang++;
                    if(countBarang==4){
                         System.out.print("Maksimal Pembelian Barang Adalah 5. Anda Sudah Memilih 4 Item Barang \n");
                    }
                }
            }
        if(countBarang==5){
            prosesBayar(totBelanja, countBarang);
        }
    }
    }


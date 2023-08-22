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
public class Aplikasipenjualan {
    public static int cekHarga(int item){
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
    
    public static int hitungPembayaran(int totBelanja){
        int totPembayaran = 0;
        if((totBelanja>500000) && (totBelanja<1000000)){
            totPembayaran = totBelanja - (totBelanja*5/100);
        }
        else if((totBelanja>=1000000) && (totBelanja<1500000)){
            totPembayaran = totBelanja - (totBelanja*10/100);
        }
        else if((totBelanja>=1500000) && (totBelanja<2000000)){
            totPembayaran = totBelanja - (totBelanja*15/100);
        }
        else if((totBelanja>=2000000) && (totBelanja<2500000)){
            totPembayaran = totBelanja - (totBelanja*20/100);
        }
        else if(totBelanja>=2500000){
            totPembayaran = totBelanja - (totBelanja*25/100);
        }
        else{
             totPembayaran = totBelanja;
        }
        return totPembayaran;
    }
    
    public static void tampilMenu(){
        //Inputan Menu
        System.out.print("=================================\n");
        System.out.print("Selamat Datang, Silahkan Pilih Menu Dibawah Ini\n");
        System.out.print("=================================\n");
        System.out.print(" 1. Mouse (150k) \n 2. Headset (150k) \n 3. Keyboard (300k) \n");
        System.out.print(" 4. Monitor (1500k) \n 5. Casing PC (700k) \n");
        System.out.print("=================================\n");
    }
    
    public static void prosesBayar(int totBelanja, int countBarang){
        //Proses Pembayaran
        int totPembayaran = hitungPembayaran(totBelanja);
        System.out.print("Total Belanja Anda Sebanyak "+countBarang+" item Sejumlah : Rp. "+totPembayaran);
    }
    public static void main (String args[]){
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
                        tampilMenu();
                        System.out.print("Silahkan Masukan Pilihan Anda : ");
                        input[countBarang] = dt.nextInt();
                        //Penentuan Harga
                        totBayar[countBarang] = cekHarga(input[countBarang]);
                        totBelanja = totBelanja + totBayar[countBarang];
                        countBarang++;
                    }
                    System.out.print("Terima Kasih\n");
                    prosesBayar(totBelanja, countBarang);
                    break;
                }
                else{
                    tampilMenu();
                    System.out.print("Silahkan Masukan Pilihan Anda : ");
                    input[countBarang] = dt.nextInt();
                    //Penentuan Harga
                    totBayar[countBarang] = cekHarga(input[countBarang]);
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


    


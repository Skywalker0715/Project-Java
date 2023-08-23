/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

import java.util.Scanner;

/**
 *
 * @author Lenovo1
 */
 class HitungDiskon {
      int harga, jumlah, total, diskon1, diskon2, diskon3, diskon4, diskon5;
      
      //method
      int ambilHarga(){
          return harga;
      }
      
      int ambilJumlah (){
          return jumlah;
      }
      
      int ambilTotal (){
          return total;
      }
      
      int hitungDiskon1(){
          return (total - ((total * 5) / 100));
      }
      
      int hitungDiskon2 (){
          return (total - ((total * 10) / 100));
      }
      
      int hitungDiskon3 (){
          return (total -((total * 15) /100));
      }
      
      int hitungDiskon4 (){
          return (total - ((total * 20) /100));
      }
      
      int hitungDiskon5 (){
          return (total -((total * 25)/100));
      }
    
}

public class PraktikumPemrogramanBasisObjek {
    public static void main(String[] args) {
        HitungDiskon totalBayar = new HitungDiskon();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Harga Barang Rp. : ");
        totalBayar.harga = input.nextInt();
        System.out.print("Jumlah Bayar : ");
        totalBayar.harga = input.nextInt();
        
        totalBayar.total = totalBayar.harga * totalBayar.jumlah;
        
        System.out.println("Total Bayar : Rp. "+totalBayar.total);
        
        if(totalBayar.total > 500000){
            System.out.println("Total Bayar (diskon 25%) : Rp. "+totalBayar.hitungDiskon5());
        }else if(totalBayar.total ==800000){
            System.out.println("Total Bayar (diskon 20%) : Rp. "+totalBayar.diskon4);
        }else if(totalBayar.total <=100000000){
            System.out.println("Total Bayar (diskon 15%) : Rp. "+totalBayar.diskon3);
        }else if(totalBayar.total <=500000){
            System.out.println("Total Bayar (diskon 10%) : Rp. "+totalBayar.diskon2);     
        }else if(totalBayar.total ==150000){
            System.out.println("Total Bayar (diskon 5%) : Rp. "+totalBayar.diskon1);
        }
        }
}



  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

/**
 *
 * @author Dina
 */
public class LatihanFungsiMenampilkanBiodata {
   
     public static String nama = "Rendy Saputra";
     
     public static String getnama(){
         return nama;
     }
     public static String NIM = "2113008";
     
     public static String getNIM(){
         return NIM;
     }
     public static String JK = "";
     
     public static String getJK(){
         return JK;
     }
     public static String jurusan = "Informatika";
     
     public static String getjurusan(){
         return jurusan;
     }
     public static String angkatan = "2021";
     
     public static String getangkatan(){
         return angkatan;
     }
     public static String Umur = "18 tahun ";
     
     public static String Umur (){
         return Umur;
     }
     
     public static void main(String[]args){
         
         String namaSaya = getnama();
         System.out.println("Nama Saya "+namaSaya);
         
         String NIMSaya = getNIM();
         System.out.println("NIM saya "+NIMSaya);
         
         String JKSaya = getJK();
         System.out.println("JK saya "+JKSaya);
         
         String jurusanSaya = getjurusan();
         System.out.println(" jurusan saya "+jurusanSaya);
         
         String angkatanSaya = getangkatan();
         System.out.println("angkatan saya "+angkatanSaya);
         
         String UmurSaya =  Umur();
         System.out.println("umur saya "+UmurSaya);
     }
         
   
        
     
     
         
     }


    


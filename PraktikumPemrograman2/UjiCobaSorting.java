/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

import java.util.*;


/**
 *
 * @author Dina
 */
public class UjiCobaSorting {
    
    public static void main(String[] args) {
        String output = "";
        char[] arrayCharacter = {'j','h','f','d','i','e','b','g','c','a'};
        
         //definisi urutan nilai huruf di variabel arrayCharacter
         
         System.out.println("huruf yang belum diurutkan : ");
         for(char urutanHuruf : arrayCharacter){
             output = ""+ urutanHuruf;
             System.out.println(output);
         }
         
         Arrays.sort(arrayCharacter);
         //mmenggunakan mehod sort untuk mengurutkan nilai huruf
         
         System.out.println("\n Huruf yang sudah diurutkan : ");
        
         for(char urutanHuruf : arrayCharacter){
             output = ""+ urutanHuruf;
             System.out.println(output);
             
         }
        
        
        }
        
     
        
    }



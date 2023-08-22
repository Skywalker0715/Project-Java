/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

import java.util.Scanner;



/**
 *
 * @author Dina
 */
public class Fibo {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya : ");
        int tambah = 0;
        for(int i =0; i<=nilai; i++){
            tambah++;
            if(nilai % tambah ==0){
                System.out.println(tambah);
            }
        }
    }

}

       
        
        
    
    
    
         
         
         
         
             
         


    

    
    


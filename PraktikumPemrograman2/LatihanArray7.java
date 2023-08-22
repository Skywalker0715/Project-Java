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
public class LatihanArray7 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       String[] bulan = new String[12];
       
       for(int i=0;i<bulan.length;i++){
           System.out.println("bulan ke-"+i+" = ");
           bulan[i] = scan.nextLine();
       }
        System.out.println();
        
        for(String a : bulan){
            System.out.println(a);
        }
        
        
    }

}

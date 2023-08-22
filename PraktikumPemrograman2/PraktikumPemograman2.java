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
public class PraktikumPemograman2 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            int nilai[]=new int[5];

            for (int i=0;i<nilai.length;i++){
                System.out.print ("Masukkan NIlai Indeks ke-"+i+": ");
                nilai [i]=input.nextInt();
                System.out.println();
            }

            System.out.print ("Data Array Adalah : ");
            for (int i=0;i<nilai.length;i++){
                System.out.print (nilai[i]+", ");
            }
        }
}
        
    
    


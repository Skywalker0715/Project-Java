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
public class PengurutanseluruhHuruf {
    
    public static void main(String[] args) {
        Scanner Masukan = new Scanner(System.in);
        System.out.println("Mengurutkan huruf abjad ");
        System.out.print("Masukan Jumlah data : ");
        int jalhdt = Masukan.nextInt();
        
        System.out.println();
        String[]data = new String[jalhdt];
        for(int a = 0; a<jalhdt; a++)
        {
            System.out.print("huruf ke- "+(a+1)+" = ");
            data[a] = Masukan.next();
        }
        System.out.println("\tProses Insertion sorting ");
        for(int a = 0; a<jalhdt-1; a++)
        {
            System.out.println("Iterasi"+(a+1));
            for(int b = 0; b<jalhdt; b++)
                System.out.print(data[b]+"");
            for(int b = a+1; b>0; b--)
            {
                if(data[b-1].compareTo(data[b])>0)
                {
                    System.out.println();
                    for(int c = 0; c<jalhdt; c++)
                        System.out.print(data[c]+"");
                    String temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                    
                }
                else{
                    System.out.println();
                    for(int c=0; c<jalhdt; c++)
                        System.out.print(data[c]+"");
                    break;
                }
                    
            }
            System.out.print("\n");
            
       }
        System.out.println("\t Huruf yang sudah diurutkan : ");
        for(int a=0; a<jalhdt; a++)
            System.out.print(data[a]+"");
    }
}
    


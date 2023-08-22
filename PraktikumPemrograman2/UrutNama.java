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
public class UrutNama {
    public static void main(String[] args) {
        
        String temp;
        int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah data yang dinput : ");
        int banyak = input.nextInt();
        String []nama = new String[10];
        
        //input data
        for(int i = 0; i<10; i++){
            nama[i] = input.next();
            System.out.println("Masukkan nama ke-"+(i+1)+" = ");
        }
        //pertukaran data
        System.out.println("Nama sebelum diurutkan : ");
        for(int i = 0; i<10; i++)
        {
            System.out.println(nama[a]);
            System.out.println();
        }
        for( int i = 1; i<9; i++)
        {
            for(int j =0; j<10; j++)
            {
                if(nama[j].compareTo(nama[j+1])>0)
                  {
                  temp = nama[j];
                  nama[j]= nama[j+1];
                  nama[j+1] = temp;
                    
                }
                //output
               
                System.out.println("Daftar nama setelah diurtutkan ");
                for( i = 0; i<10; i++)
                {
                    System.out.println(nama[i]);
                
                }
              
                
            }
        }
        
       
    
       
    }
}

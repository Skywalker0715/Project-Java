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
public class LatihanArray5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int nilai [] =new int[100];
        int arr_count;
        float total, rata2;
        
        System.out.print ("masukan jumlah elemen array : ");
        arr_count =input.nextInt();
        
        System.out.println("Masukan" +arr_count+" angka  : ");
        
        for(int i=0;i<arr_count;i++){
            nilai[i] = input.nextInt();
            System.out.println();
        }
        
        total = 0;
        for(int i=0;i<arr_count;i++){
            total = total+nilai[i];
        }
        
        rata2 = (total/arr_count);
        System.out.println("Nilai rata-rata = "+arr_count+" = "+rata2);
    
    }
}

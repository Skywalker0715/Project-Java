/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemograman2;

import java.util.Arrays;

/**
 *
 * @author Dina
 */
public class LatihanArray8 {
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5};
        int B [] = {5,6,7,8,9};
        int sumA = 0;
        int sumB = 0;
        int jumlah;
        
        for( int num : A){
            sumA = sumA + num;
        }
        
        for(int num : B){
            sumB = sumB + num;
            
        }
        
        jumlah = sumA + sumB;
        
        System.out.println("jumlah nilai kedua elemen array : "+jumlah);
        
        int [] AB = new int[A.length+B.length];
        System.arraycopy(A, 0, AB, 0, B.length);
        System.arraycopy(B, 0, AB, A.length,B.length);
        
        System.out.println("menjumlahkan nilai kedua elemen array");
        System.out.println(Arrays.toString(AB));
        
        
    }
}

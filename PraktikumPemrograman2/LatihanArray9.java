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
public class LatihanArray9 {
    public static void main(String[] args) {
        int nilai[] = {9,2,5,3,7,4,5,9,2,7,3,6};
        int array[] = new int[nilai.length];
        
         for( int i=0;i<nilai.length;i++){
             int A = nilai[nilai.length-i-1];
             array[i] = A;
             System.out.print(""+A);
             
             
         }
          
         
         
         
        
    }
}

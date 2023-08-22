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
public class LatihanArray4 {
    public static void main(String[] args) {
        int nilai[]= new int[5];
        int total = 0, rata2;
        
        
         nilai[0] = 7;
         nilai[1] = 8;
         nilai[2] = 9;
         nilai[3] = 10;
         nilai[4] = 11;
         
         for(int i=0;i<nilai.length;i++){
             total = total + nilai[i];
         }
        
         rata2 = (total/nilai.length);
         
         System.out.println("Nilai rata-rata = "+nilai.length+" = "+rata2);
         
        }
        
        
        
                 
        
        
    }


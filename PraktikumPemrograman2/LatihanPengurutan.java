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
public class LatihanPengurutan {
    
    public static void bubble(int a[], int b){
        int i, j, t = 0;
        for ( i = 0; i<b; i++){
            for(j = 1; j<(b-1); j++){
                if (a[j-1] > a[j]){
                    t = a[j-1];
                    a[j-1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
    
    
    public static void main(String [] args){
        
        int i;
        int nilaiKarakter[] = {'d','e','f','g','j','h','a','b','i','c'};
        
        System.out.print("data sebelum diurut:\n");
        for(i = 0; i<nilaiKarakter.length; i++){
            System.out.print(nilaiKarakter[i] + "");
        }
        System.out.println("");
        
        bubble(nilaiKarakter, nilaiKarakter.length);
        System.out.print("data setelah diurutkan:\n");
        for(i = 0; i<nilaiKarakter.length; i++){
            System.out.print(nilaiKarakter[i] + "");
        }
        System.out.println("");
        
        
        
        
    }
    
}

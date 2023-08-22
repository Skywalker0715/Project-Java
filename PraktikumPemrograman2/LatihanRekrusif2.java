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
public class LatihanRekrusif2 {
    
    public static long angka(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else
            return angka(n-1) + angka(n-2);
    }
    
    public static void main(String[]args){
        for(int i=0; i<9; i++){
            System.out.print("  "+angka(i));
            
            
        }
        
    }
    }


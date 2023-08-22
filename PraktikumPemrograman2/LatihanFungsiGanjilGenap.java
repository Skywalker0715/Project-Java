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
public class LatihanFungsiGanjilGenap {
    
    static String ganjilgenap(int x){
        String bilangan;
        if (x % 2 == 0){
            bilangan = "Genap";
        }
        else {
            bilangan = " Ganjil ";
            
        }
        return bilangan;
    }
    public static void main(String[]args){
        int x = 25;
        String bilangan;
       
        bilangan = ganjilgenap(x);
        System.out.println(bilangan);
        
    }
        
     
        
    }
   

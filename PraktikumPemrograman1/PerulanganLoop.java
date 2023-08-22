/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemrograman1;




/**
 *
 * @author Dina
 */
public class PerulanganLoop {
    public static void main(String[]args) {
          int a;
          int b = 1;
          
          for( a=64; a>0;) {
              String binary = Integer.toBinaryString(a);
              System.out.println(""+binary);
              a= a>>b;
          }
    }  
}
    

                                                 
         
          
        
    
     
       
    


    


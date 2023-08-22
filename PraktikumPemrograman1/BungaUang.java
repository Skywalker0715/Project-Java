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
public class BungaUang {
     public static void main(String[]args) {
         float uang = 1000000;
         int bunga = 10;
         
          for ( int i = 1; i<=10; i++) {
             uang = uang + ( uang*10/100);
             
             System.out.println("Uang setelah 10 tahun adalah = "+uang);
         }
     }
}

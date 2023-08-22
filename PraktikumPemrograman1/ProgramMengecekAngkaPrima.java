/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemrograman1;

import java.util.Scanner;

/**
 *
 * @author Dina
 */
public class ProgramMengecekAngkaPrima {
    public static void main(String[] args) {
         Scanner masuk = new Scanner(System.in);
        int pil;
         System.out.println("Masukan pilihan : ");
        
         pil = masuk.nextInt();
         switch (pil){
             case 1 : System.out.println("Bukan bilangan prima ");  
             break;
             case 2 : System.out.println(" Bilangan prima ");
             break;
             case 3 : System.out.println("Bilangan prima");
             break;
             case 4: System.out.println("Bukan bilangan prima");
             break;
             case 5: System.out.println("Bilangan prima");  
             break;
             case 6: System.out.println("Bukan bilangan prima");
             break;
             case 7: System.out.println("Bilangan prima");
             break;
             case 8: System.out.println("Bukan bilangan prima");
             break;
             case 9: System.out.println("Bilangan prima");  
             break;
             case 10: System.out.println("Bukan bilangan prima");
             break;
             case 11: System.out.println("Bilangan prima");
             break;
             case 12 : System.out.println("Bukan bilangan prima");
             break;
             case 13 : System.out.println("Bilangan prima");
    }
}
}

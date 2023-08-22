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
public class PredikatKelulusanMhs {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String predikat;
        System.out.println("Masukan predikat kelulusan : ");
        predikat = masuk.nextLine();
        
        switch (predikat){
            case "Memuaskan" :
                System.out.println("predikat kelulusan berada dianatara 2.00 samapai 2.75");
                break;
            case "Sangat memuaskan"  :
                System.out.println("predikat kelulusan berada diantara 2.76 sampai 3.50");
                break;
             case"Dengan pujian"   :
                 System.out.println("predikat kelulusan berada diantara 3.51 sampai 4.00");
             default :
                 System.out.println("predikat kelulusan tidak diketahui");
                 break;
        }
         
             
         }
    }


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
public class LatihanFungsiNo4 {
    
    static int kuadrat(int a){
        int kuadrat = a * a;
        return kuadrat;
    }
    public static void main(String[]args){
        int a = 10;
        String kalimat = "Hasil dari "+a+" kuadrat adalah ";
        
        int nilai = kuadrat(a);
        System.out.println(kalimat+nilai);
    }
    
}

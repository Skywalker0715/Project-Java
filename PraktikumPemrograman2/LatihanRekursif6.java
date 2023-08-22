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
public class LatihanRekursif6 {
    
    public static int faktorial(int num){
        if(num == 0 ){
            return 0;
        }
        else if(num<2){
            return num;
        }
        else {
            return num*faktorial(num-1);
        }
    }
    
    public static int permutasi(int num1,int num2){
        int hasilp = faktorial(num1)/faktorial(num2)*faktorial(num1-num2);
        return hasilp;
    }
    public static int kombinasi(int num1, int num2){
        int hasilc = faktorial(num1)/faktorial(num2)*faktorial(num1-num2);
        return hasilc;
    }
    
    public static void main(String[]args){
        System.out.print("Hasil dari 6 permutasi 4 adalah ");
        System.out.println(permutasi(6,4)+"");
        System.out.print("hasil dari 10 kombinasi 5 adalah ");
        System.out.println(kombinasi(10,5)+"");
        System.out.print("Hasil dari 9 permutasi 3 adalah ");
        System.out.println(permutasi(9,3)+"");
        System.out.print("hasil dari 6 kombinasi 4 adalah ");
        System.out.println(kombinasi(6,4)+"");
    }
}
        
            
        
    
    


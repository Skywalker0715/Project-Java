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
public class LatihanRekrusif4 {
    
    public static int faktorfungsi(int num,int bagi){
        if(num%bagi ==0){
            System.out.print(bagi+"");
            return faktorfungsi(num,bagi+1);
        }
        else if(num%bagi ==num){
            return 1;
        }
        else {
            return faktorfungsi(num,bagi+1);
        }
        
     }
    
     public static void faktorProsedur(int num, int bagi){
         if(num%bagi == num){
             
         }
         else if(num%bagi== 0){
             System.out.print(bagi+"");
             faktorProsedur(num,bagi+1);
         }
         else {
             faktorProsedur(num,bagi+1);
         }
     }
     
     public static void main(String[]args){
        int num = 12;
        int bagi = 0;
        
         System.out.print("Hasil dengan Rekursif metode fungsi : ");
         faktorProsedur(num,bagi+1);
         System.out.println("");
         System.out.println("Hasil dengan Rekursif metode Prosedur  : ");
         faktorfungsi(num,bagi+1);
     }
        
      
      }

        

    
    

    

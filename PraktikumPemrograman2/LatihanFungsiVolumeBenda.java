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
public class LatihanFungsiVolumeBenda {
    
    public static int volumebalok(){
        //inputan
        int p = 10;
        int l = 10;
        int t = 10;
        
        //proses
        int hasil = p * l * t;
        
        return hasil;
        
    }
    public static void main(String[]args){
        String kalimat = "Hasilnya = ";
        
        //proses
        int hasilJumlah = volumebalok();
        
        System.out.print(kalimat+hasilJumlah);
    }
    
}

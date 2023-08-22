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
public class LatihanSort {
    
    public static void swap(int[]data, int i, int j){
       int temp = data[i];
       data[i] = data[j];
       data[j] = temp;
    }
    
     public static void bubble(int[] data) {
        for(int i = 1; i<data.length; i++){
            for(int j = 0; j<=i; j--){
                if(data[j]<data[i])
                    swap(data, i, j);
            }
        }
    }

    
    public static void main(String[]args){
        int[]data = {5,10,1,4,12,20};
        System.out.println("Nilai yang sudah diurutkan");
        
        for(int i : data)
            System.out.println(""+i);
    }
    
}

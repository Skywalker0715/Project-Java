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
public class ShellSort {
    
    public int[]shellAsc(int[]data, int n) {
        int temp, j;
        
        for(int dist = n/2; dist>0; dist/=2){
            for(int i = dist; i<n; i++) {
                temp = data[i];
                
                
                for(j = i; j>=dist&&data[j-dist]>temp; j-=dist){
                    data[j] = data[j-dist];
                }
                
                data[j] = temp;
            }
        }
        return data;
    }
    
    public static void print(int[]data){
        for(int i:data){
            System.out.print(i+"");
        }
    }
    
    public static void main(String[]args){
        int[]arr = {1,-5,4};
        int n = arr.length;
        ShellSort A = new ShellSort();
        
        System.out.print("Shell Ascending = ");
        print(A.shellAsc(arr, n));
    }
    
}

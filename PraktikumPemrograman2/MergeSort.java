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
public class MergeSort {
    public static void main(String a[]) {
        //Nomor yang akan di urutkan
        int n [] = {2,3,1};
        System.out.println("Sebelum di Urutkan = ");
            for(int i = 0; i < n.length; i++) {
                System.out.print(n[i]+" ");
            }
        System.out.println();
        
        mergeSort(n,0,n.length-1);
        System.out.println();   
        System.out.println("Setelah di Urutkan = ");
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }
        
    public static void mergeSort(int n[], int lo, int hi) { 
        int low = lo;
        int high = hi;
            if (low>=high){
                return;
            }
        int middle=(low+high)/2;
    
        mergeSort(n,low,middle);
        mergeSort(n,middle+1,high);
    
        int end_low=middle;
        int start_high=middle+1;
        System.out.println(end_low+" End_Low ; "+start_high+" Start_High ; "+low+" Low ; "+high+" High ; ");
        while ((low<=end_low) && (start_high<=high)) {
            if (n[low]<n[start_high]) {
                low++;
            }
            else {
                int Temp=n[start_high];
                for (int k=start_high-1;k>=low;k--) {
                    n[k+1]=n[k];
                }
                n[low]=Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }  
}
    

    
    
    
    


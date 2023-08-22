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
public class BucketSort  {
 
    public static void bucketsort(int[] a, int maxVal){
        int[] bucket = new int[maxVal+1];
        
        //mengisi Nilai Bucket Sebanyak maxVal+1 dengan 0
        for(int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }
        //mengupdate nilai bucket dari 0 ke 1
        for(int i=0; i<a.length; i++){
            bucket[a[i]]++;
        }
     
        int outPos=0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                a[outPos++]=i;
            }
        }
    }
    
    public static void main(String[] args){
        int [] data= {22,17,25};
        int maxVal=0;
        
        for(int i=0; i<data.length; i++){ 
            if(data[i]>maxVal)
                maxVal=data[i];
        }
        
        //menampilkan isi Array
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+"");
        }
        
        System.out.println();
        //pengurutan
        bucketsort(data,maxVal);
        System.out.println();
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+"");
        }
    }
    }
   


    


   

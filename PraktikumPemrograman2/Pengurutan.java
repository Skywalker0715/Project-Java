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
public class Pengurutan {
    //Prosedur yang digunakan untuk Swap (Bertukar Posisi)
    public static void swap(int[] data, int i, int j) {
        int temp=data[i]; 
        data[i] = data[j];
        data[j] = temp;
    }
	
	//Pengurutan dengan Bubble Sort
    public static void bubble(int[] data) {
        for(int i=1; i<data.length; i++)
            for(int j=data.length-1; j>=i; j--)
                if(data[j-1]<data[j])
      //Memanggil Fungsi Swap (Tukar Posisi)
                    swap(data, j-1, j); 
    }
    
	
	//Pengurutan dengan Selection Sort
    public static void selection (int[] data) {
        int i, j, Imak;
         for(i=data.length-1; i>0; i--){
             Imak=i;
            for(j=i-1; j>=0; j--)
                if(data[j]<data[Imak])
                    Imak=j;
			//Memanggil Fungsi Swap (Tukar Posisi)
            swap(data, i, Imak);
        }
    }
	
	//Pengurutan dengan Insertion
    public static void insertion(int[] data) {
        int i,j,temp;
         for(i=1; i<data.length; i++){
             temp=data[i];
             for(j=i-1; (j>=0)&&(data[j]<temp);j--)
                data[j+1]=data[j];
             data[j+1]=temp;
         }
    }

    public static void main(String[] args) {
        int[] data = { 6, 4, 3 ,2 , 1, 10, 11, 15};
        System.out.print("Nilai sebelum diurutkan : ");
        for(int a: data)
            System.out.print(a+" ");
		
      //AKTIFKAN SALAH SATU DENGAN MENGHAPUS DOUBLE SLASH
      //-------------------------------------------------
        //bubble(data);
        //selection(data);
        //insertion(data);
        System.out.println();

        System.out.print("Nilai sesudah diurutkan : ");
        for(int a: data)
            System.out.print(a+" ");

        System.out.println();
    }
}

    


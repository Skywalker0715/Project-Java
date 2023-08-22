/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

import java.util.Scanner;






/**
 *
 * @author Dina
 */
public class Aplikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String barang[] = {"Mouse","headset","Keyboard","Monitor","Casing PC"};
        double harga[] = {1500000,1500000,300000,15000000,700000};
        String beli[] = {"","","","",""};
        
        boolean ulang = true;
        while(ulang){
            System.out.println("Beli barang:");
            System.out.println("1. Mouse\t\t= Rp 150.000"
                            + "\n2. Headset\t= Rp 150.000"
                            + "\n3. Keyboard\t\t= Rp 300.000"
                            + "\n4. Monitor\t   = Rp 1500.000"
                            + "\n5. Casing PC\t = Rp 700.000");
            System.out.println("Masukkan barang yang ingin Anda beli, (format: kode barang)");
            System.out.println("Input 0 jika ingin berhenti membeli");
            System.out.print("Anda akan membeli");
            double total = 0;
                for (int i = 1; ulang && i<=5;) {
                    System.out.print(", masukkan kode barang selanjutnya: ");
                    String pil = input.nextLine();
                    if(pil.equals("1") || pil.equals("2") || pil.equals("3") || pil.equals("3") || pil.equals("4") || pil.equals("5")){
                        if((Integer.parseInt(pil)-1)<5){
                            beli[i-1] = barang[Integer.parseInt(pil)-1];
                            System.out.print("Anda membeli "+beli[i-1]);
                            total = total+harga[Integer.parseInt(pil)-1];
                            i++;
                        }
                    }
                    else if (pil.equals("0") && i==1) System.out.print("Maaf! Anda belum membeli barang");
                    else if (pil.equals("0") && i!=1) ulang = false;
                    else System.out.print("Maaf! Inputan salah");
                }
                System.out.print("\nBarang yang Anda beli: ");
                for (int i = 0; i < beli.length; i++) {
                    if(!beli[i].equals("")) System.out.print(beli[i]+", ");
                }
                System.out.println("\nTotal harga sebelum diskon: "+total);
                System.out.println("Jumlah yang harus dibayar: "+hargaDiskon(total));
                ulang = false;
            }
        }

    static double hargaDiskon(double harga){
        double minimal = 500000;
        double total = harga;
        if(harga>=minimal&&harga<minimal*2){
            total = harga - (harga*5/100);
            System.out.println("Anda mendapatkan diskon sebesar 5%");
        }
        else if (harga>=minimal*2&&harga<minimal*3){
            total = harga - (harga*10/100);
            System.out.println("Anda mendapatkan diskon sebesar 10%");
        }
        else if (harga>=minimal*3&&harga<minimal*4){
            total = harga - (harga*15/100);
            System.out.println("Anda mendapatkan diskon sebesar 15%");
        }
        else if (harga>=minimal*4&&harga<minimal*5){
            total = harga - (harga*20/100);
            System.out.println("Anda mendapatkan diskon sebesar 20%");
        }
        else if (harga>=minimal*5){
            total = harga - (harga*25/100);
            System.out.println("Anda mendapatkan diskon sebesar 25%");
        }
        return total;
    }
}

    

                    
                        
                
   
         
           

        

                        
                   
 
            
            
        
    

    


    
          
    
    
  
    


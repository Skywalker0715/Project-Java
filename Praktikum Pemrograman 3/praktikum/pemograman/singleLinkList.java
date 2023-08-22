/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pemograman.pkg3;

/**
 *
 * @author Lenovo1
 */
class node {
    int data;
    node next;

    public node(int d){
        data = d;
        next = null;
    }

    int getnode(){
        return (data);
    }
}

class LinkedList2{
    node head;
    node tail;
    int jumlah;

    public LinkedList2(){
        head = null;
        tail = null;
        jumlah = 0;
    }

    void tambahbelakang(node baru){
        if(head==null){
            head = baru;
            tail = baru;
        }
        else {
            tail.next = baru;
            tail = baru;
        }
    }

    void tambahdepan(node baru){
        if(head==null){
            head = baru;
            tail = baru;
        }
        else {
            baru.next = head;	//Jika linked list sudah berisi,
            head = baru;
        }
    }

    void hapusdepan(){
        int data;
        if(head.next != null){
            data = head.getnode();
            head = head.next;
            System.out.println("Data "+data+" berhasil dihapus..");
        }
        else{
            System.out.println("Data Kosong");
        }
    }

    void hapusbelakang(){
        int data;
        node temp,bantu;
         if(head.next != null){
            data = tail.getnode();
            temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            bantu=tail;
            tail=temp;
            tail.next=null;
            System.out.println("Data "+data+" berhasil dihapus..");
        }
        else{
            System.out.println("Data Kosong");
        }
    }

    void hapusData(int dataCari){
 	node temp = head;
 	if (head.next != null){
            while (temp != null){
                if (temp.next.data == dataCari){	//mengganti temp.next dengan
                    temp.next = temp.next.next; //temp.next.next
                    break;	//dari temp --> temp.next -->temp.next.next
 		}			//menjadi temp --> temp.next.next
 		else if ((temp.data == dataCari)&&(temp == head)){
                    this.hapusdepan();//jika key berada pada awal linked list,
                    break;		//maka call method removeFirst
                }
            temp = temp.next;
            }
            System.out.println("Data "+dataCari+" berhasil dihapus..");
 	}
        else System.out.println("Data Kosong");
    }

    void cariData (int dataCari){
  	int i = 0;
  	boolean found = false;
  	node temp = head;
  	while (temp != null){
            if (temp.data == dataCari){
    		found = true;
    		break;
            }
            i++;
            temp = temp.next;
  	}
  	if (found==true){
            System.out.println(dataCari+" ditemukan pada indeks ke "+i);
  	}
  	else System.out.println("Data Tidak Ada");
 	}

    void tampil(){
        node temp;
        for(temp=head; temp!=null; temp=temp.next){
            System.out.println(temp.getnode()+" ");
        }
    }
}

public class singleLinkList {
    public static void main(String args[]){
        node simpul1 = new node(4);
        node simpul2 = new node(3);
        node simpul3 = new node(5);
        node simpul4 = new node(1);

        LinkedList2 LL = new LinkedList2();
        LL.tambahbelakang(simpul1);
        LL.tambahbelakang(simpul2);
        LL.tambahbelakang(simpul3);
        LL.tambahdepan(simpul4);
        LL.tampil();

        LL.cariData(5);
        LL.hapusData(3);
        LL.hapusbelakang();
        LL.tampil();

        LL.hapusdepan();
        LL.tampil();

        LL.hapusdepan();
        LL.hapusdepan();
    }
}

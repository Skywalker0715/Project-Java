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
class Link {
    public int iData;
    public Link next;
    public Link prev;

    public Link(int id) {
        iData = id;
    }

    public String toString() {
        return "{" + iData + "} <- -> ";
    }
}

class DoublyLinkedList {
    private Link head;
    private Link tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void inserthead(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty()){
            tail = newLink;
        }
        else{
            head.prev = newLink;
        }
        newLink.next = head;
        head = newLink;
    }

    public void inserttail(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty()){
            head = newLink;
        }
        else{
            tail.next = newLink;
            newLink.prev = tail;
        }
        tail = newLink;
    }

    public Link deletehead() {
        Link temp = head;
        if (head.next == null){
            tail = null;
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
        return temp;
    }

    public Link deletetail() {
        Link temp = tail;
        if (head.next == null){
            head = null;
        }
        else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        return temp;
    }

    public boolean insertAfter(int key, int dd) {
        Link current = head;
        while (current.iData != key) {
            current = current.next;
            if (current == null){
            return false;
            }
        }

        Link newLink = new Link(dd);
        if (current == tail) {
            newLink.next = null;
            tail = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.prev = newLink;
        }
        newLink.prev = current;
        current.next = newLink;
        return true;
  }

  public Link deleteKey(int key) {
        Link current = head;
        while (current.iData != key) {
            current = current.next;
            if (current == null)
                 return null;
        }
        if (current == head){
            head = current.next;
        }
        else{
            current.prev.next = current.next;
        }

        if (current == tail){
            tail = current.prev;
        }
        else{
            current.next.prev = current.prev;
        }
        return current;
    }

    public String toString() {
        String str = "List (head-->tail): ";
         Link current = head;
        while (current != null) {
            str += current.toString();
            current = current.next;
        }
        return str;
    }
}

public class DoubleLinkedList {
     public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();

		theList.inserthead(22);
        theList.inserthead(44);
        theList.inserthead(66);

        theList.inserttail(11);
        theList.inserttail(33);
        theList.inserttail(55);

        System.out.println(theList);
        
        theList.deletehead();
        theList.deletetail();
        theList.deleteKey(11);

        System.out.println(theList);

        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.insertAfter(34, 88);

        System.out.println(theList);
    }
}

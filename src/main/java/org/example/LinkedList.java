package org.example;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void print(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    public void addAtStart(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public Node remove(int index){
        if(index<0 || index >= size ){
            System.out.println("INDEX OUT OF BOND");
            return null;
        }else if(index == 0){
            Node temp = head;
            head = temp.next;
            temp.next =null;
            size--;
            return temp;
        }
        Node temp = head;
        for(int i =0; i<index-1; i++){
            temp = temp.next;
        }

        Node temp2 =null;
        if(temp.next == tail) {
            temp2 =tail;
            temp.next =null;
            tail = temp;
        }else{
            temp2 = temp.next;
            temp.next = temp2.next;
            temp2.next = null;
        }
        size--;
        return temp2;
    }
}

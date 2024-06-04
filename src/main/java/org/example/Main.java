package org.example;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.addAtStart(222);
        list.print();
        System.out.println();

        list.remove(6);

        list.print();

        System.out.println();
        System.out.println("SIZE : "+ list.size);


    }
}
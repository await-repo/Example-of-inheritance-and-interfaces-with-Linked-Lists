package test;

import list.*;

public class test {
    public static void main (String []args) {

        circularDoublyLinkedList list = new circularDoublyLinkedList();

        //circularLinkedList list = new circularLinkedList();

        //doublyLinkedList list = new doublyLinkedList();

        //linkedList list = new linkedList();

        list.add(5);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(13);
        list.add(5);
        list.add(14);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println();
        list.show();

        System.out.println("\nDeleting...");
        list.delete(5, list);
        //list.delete(5);
        System.out.println();
        list.show();
        System.out.println("Size :" + list.size + "\n");


        System.out.println("\nAdding Nodes...\n");
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);

        System.out.println("Show List (Doubly List, Circular Doubly List, Simple List or Simple Circular List)");
        list.show();
        System.out.println("\nSize :" + list.size + "\n");

    }
}
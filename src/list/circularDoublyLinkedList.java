package list;

import superList.*;
import subList.*;
import interfaceList.*;

public class circularDoublyLinkedList extends circularList implements interfaceDoublyList {

    public circularDoublyLinkedList() {
        super(0);
    }

    public void add(int number){
        Node node = new Node(number);

        if ( isEmpty() ){
            header = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        last.next = header;
        header.prev = last;
        size++;
    }

    public void deleteFirst () {
        if (isValid()){
            header = header.next;
            last.next = header;
            header.prev = last;
            size--;
        }
    }

    public void deleteLast () {
        if (isValid()) {
            last = last.prev;
            last.next = header;
            header.prev = last;
            size--;
        }
    }

    public void showInverse(){
        Node node = last;
        do {
            System.out.println( node.getNumber() );
            node = node.prev;
        }while (node != last);
    }

}
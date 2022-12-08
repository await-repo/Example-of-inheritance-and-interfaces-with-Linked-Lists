package list;

import interfaceList.*;
import superList.*;
import subList.*;

public class doublyLinkedList extends simpleList implements interfaceDoublyList {

    public doublyLinkedList() {
        super(0);
    }

    public void add(int number){
        Node node = new Node(number);

        if ( isEmpty() ){
            node.prev = node.next = null;
            header = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public void deleteFirst () {
        if (isValid()) {
            header = header.next;
            header.prev = null;
            size--;
        }
    }

    public void deleteLast () {
        if (isValid()){
            last = last.prev;
            last.next = null;
            size--;
        }
    }

    public void showInverse () {
        for (Node node = last; node != null; node = node.prev)
            System.out.println( node.getNumber() );
    }

}
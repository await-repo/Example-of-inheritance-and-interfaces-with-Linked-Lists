package list;

import superList.*;
import subList.*;
import interfaceList.*;

public class circularLinkedList extends circularList implements interfaceSimpleList {

    public circularLinkedList() {
        super(0);
    }

    public void add(int number){
        Node node = new Node(number);

        if ( isEmpty() ){
            header = last = node;
        } else {
            last.next = node;
            last = node;
        }
        last.next = header;
        size++;
    }

    public void deleteFirst () {
        if (isValid()){
            header = header.next;
            last.next = header;
            size--;
        }
    }

    public void deleteLast () {
        if (isValid()) {
            Node i;
            for ( i = header; i.next != last; i = i.next);
            i.next = header;
            last = i;
            size--;
        }
    }

}
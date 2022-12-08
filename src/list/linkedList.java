package list;

import interfaceList.*;
import superList.*;
import subList.*;

public class linkedList extends simpleList implements interfaceSimpleList {

    public linkedList() {
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
        size++;
    }

    public void deleteFirst () {
        if (isValid()){
            header = header.next;
            size--;
        }
    }

    public void deleteLast () {
        if (isValid()) {
            Node i = header;
            for ( ;i.next != last; i = i.next);
            i.next = null;
            last = i;
            size--;
        }
    }


}
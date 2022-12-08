package interfaceList;

import superList.*;

public interface interfaceSimpleList {

    /*Metodo Igual Para Circular Linked List y Linked List*/
    public default void delete(int number, list list) {

        while (list.header.number == number)
            list.deleteFirst();

        while (list.last.number == number)
            list.deleteLast();

        for (Node aux = list.header; aux != list.last; aux = aux.next)
            while(aux.next.number == number) {
                aux.next = aux.next.next;
                list.size--;
            }
    }

}

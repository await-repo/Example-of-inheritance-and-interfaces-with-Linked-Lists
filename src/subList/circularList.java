package subList;

import superList.*;

public abstract class circularList extends list {

    public circularList (int size) {
        super(size);
    }

    /*Metodo show() es igual para las Listas Circulares*/
    public final void show(){
        Node node = header;
        do {
            System.out.println( node.getNumber() );
            node = node.next;
        }while (node != header);
    }

    /*Metodo search es igual para las Listas Circulares*/
    public final Node search(int number){
        Node node = header;
        do {
            if (number == node.number)
                return node;
            node = node.next;
        }while (node != header);

        return null;
    }

}
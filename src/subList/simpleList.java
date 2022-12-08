package subList;

import superList.*;

public abstract class simpleList extends list {

    public simpleList (int size) {
        super(size);
    }

    /*Metodo show() igual para las listas simples*/
    public final void show(){
        for (Node node = header; node != null; node = node.next)
            System.out.println( node.getNumber() );
    }

    /*Metodo search igual para las listas simples*/
    public final Node search(int number){
        for (Node node = header; node != null; node = node.next)
            if (number == node.number)
                return node;

        return null;
    }

}
package superList;

public abstract class list {

    public Node header;

    public Node last;

    public int size;

    public list(int size) {
        this.size = size;
        this.header = null;
        this.last = null;
    }

    /*Metodo isEmpty() Igual en todos*/
    public final boolean isEmpty(){
        return header == null;
    }

    /*Metodo isValid () Igual en todos*/
    public final boolean isValid () {
        if ( isEmpty() ){
            System.out.println("List Empty");
        } else if (header == last){
            header = last = null;
            size = 0;
        }
        return header != null;
    }

    /*Metodo getSize () Igual en todos*/
    public final int getSize () {
        return size;
    }

    /*Metodos Abstractos que son Utilizados por todas las Listas*/
    public abstract void add(int number);
    //public abstract void delete (int number);
    public abstract void deleteFirst ();
    public abstract void deleteLast ();
    public abstract void show();
    public abstract Node search(int number);

}
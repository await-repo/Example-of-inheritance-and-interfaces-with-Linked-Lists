package superList;


public class Node {

    public int number;
    public Node next;
    public Node prev;


    public Node(int number){
        this.number = number;
        this.next = null;
        this.prev = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
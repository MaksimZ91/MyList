package org.example.MyList;

public class Node {
    protected int value;
    protected Node next;
    protected Node previous;

    Node(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

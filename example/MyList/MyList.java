package org.example.MyList;

public class MyList {
  private Node head;
  private Node tail;

    public void add(int i){
        Node newNode = new Node(i);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            newNode.next = null;
            tail = newNode;
        }
    }

    public boolean remove(int i){
        Node deletNode = find(i);
        if (deletNode != null){
            Node nextNode = deletNode.next;
            Node prevNode = deletNode.previous;
            prevNode.next = nextNode;
            nextNode.previous = prevNode;
            return true;
        }
        return false;
    }

    public Node find(int value){
        Node curentNode = head;
        if (curentNode == null)
            return null;
        Node result = null;
        while (curentNode != null){
            if (curentNode.value == value){
                result = curentNode;
                curentNode = null;
            }else{
                curentNode = curentNode.next;
            }
        }
        return result;
    }

    public void reverse(){
        Node curentNode = head;
        Node tmp = head;
        head = tail;
        tail = tmp;
        while (curentNode != null){
            tmp = curentNode.next;
            curentNode.next = curentNode.previous;
            curentNode.previous = tmp;
            curentNode = curentNode.previous;
        }
    }



    @Override
    public String toString() {
        Node curentNode = head;
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        while (curentNode != null){
            result.append(curentNode.value);
            if(curentNode.next != null)
                result.append(", ");
            curentNode = curentNode.next;
        }
        result.append(" ]");
        return result.toString();
    }


}

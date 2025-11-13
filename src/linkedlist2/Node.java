package linkedlist2;

public class Node {
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data =data;
        this.next= null;
    }
    public Node(int data,Node next){
        this.data =data;
        this.next= next;
    }
    public Node getNext() {
        return next;
    }
    public int getData() {
        return data;
    }

}

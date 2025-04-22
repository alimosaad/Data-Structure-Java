package linkedList;

public class Node <T>{
    T value;
    Node<T> next;
    public Node(T value){
        this.value=value;
        next=null;
    }
    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return  value;
    }
    public void setNext(Node<T> next){
        this.next=next;
    }
    public Node<T> getNext(){
        return next;
    }
}

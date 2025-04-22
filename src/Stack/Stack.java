package Stack;

import linkedList.Node;

public class Stack<T> {
    Node<T> top;
    public Stack(){
        top=null;
    }
    public void push(T data){
        Node<T> tNode=new Node<>(data);
        if (isEmpty()){
            top=tNode;
            return;
        }
        tNode.setNext(top);
        top=tNode;
    }
    public void pop(){
        Node<T> tNode=top;
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Stack Is Empty");
        }
        top=tNode.getNext();

    }
    public boolean isEmpty(){
        return top==null;
    }
    public void print(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Stack Is Empty!!");
        }
        Node<T> tNode=top;
        System.out.print("Stack Data Is: ");
        while (tNode!=null){
            System.out.print(tNode.getValue()+" ");
            tNode=tNode.getNext();
        }

    }
    public void peek(){
        if (isEmpty()){
            throw  new IndexOutOfBoundsException("Stack Is Empty!!");
        }
        System.out.print("Top Value Is: "+top.getValue());
    }
}

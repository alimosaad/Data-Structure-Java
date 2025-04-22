package Queue;

import linkedList.Node;


public class Queue <T>{
    private Node<T> front;
    private Node<T> rear;
    public Queue(){
        front=rear=null;
    }
    public void Enqueue(T data){
        Node<T> tNode=new Node<T>(data);
        if (IsEmpty()){
            front=rear=tNode;
            return;
        }
        rear.setNext(tNode);
        rear=tNode;
    }
    public void Dequeue(){
        if (IsEmpty()){
            throw new IndexOutOfBoundsException("Queue Is Empty");
        }

        front=front.getNext();
        if (front==null){
            rear=null;
        }
    }
    public void printQueue(){
        if (IsEmpty()){
            throw new IndexOutOfBoundsException("Queue Is Empty!!");
        }
        Node<T> temp=front;
        System.out.print("Current Queue: ");
        while (temp!=null){
            System.out.print(temp.getValue()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public boolean IsEmpty() {
        return front==null;
    }
    public T getFront(){
        if(IsEmpty()){
            throw new IndexOutOfBoundsException("Queue Is Empty!");
        }
        return front.getValue();
    }
    public T getRear(){
        if (IsEmpty()){
            throw new IndexOutOfBoundsException("Queue Is Empty!!");
        }
        return rear.getValue();
    }
    public int size(){
        int count=0;
        Node<T> temp=front;
        while (temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
}

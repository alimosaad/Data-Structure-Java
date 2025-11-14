package linkedlist2;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    Node head=null ;
    Node tail=null;
    private int numOfItem;
    public linkedlist(){
        numOfItem=0;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
            numOfItem++;
        }
        else{
            this.tail.next=newNode;
            this.tail=newNode;
            numOfItem++;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head =newNode;
            this.tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        numOfItem++;


    }

    public Node findNode(int current){
        Node temp=head;
        while(temp!=null&&current!=temp.getData()){
            temp=temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found");
        }
        return temp;
    }
    public void insertAfter(int current,int data){
        Node temp =findNode(current);
        Node newNode=new Node(data);
        newNode.next = temp.next;
        temp.next=newNode;
        if(tail==temp){
            tail=newNode;
        }



    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.next;

        }
    }
    public int size (){
        return numOfItem;
    }

}

package Stack;

import linkedlist2.Node;
import linkedlist2.linkedlist;


public class StackUsingLinkedList {

    Node top;

    linkedlist list =new linkedlist();
    public StackUsingLinkedList(){
        top=null;
    }

    public void push(int x){
        list.addFirst(x); // we can update using top=list.head or use node and implement node manually --> the best way.
        top=list.head;
    }
    public boolean isEmpty() {
        return top==null;
    }
    public int pop(){
        int head= list.head.getData();
        list.deleteHead();
        return head;
    }
    public void top(){
        if (isEmpty()){
            throw  new IndexOutOfBoundsException("Stack Is Empty!!");
        }
        top=list.head;
        System.out.print("Top Value Is: "+top.getData());
    }

    public void print(){
        list.printList();
    }

}

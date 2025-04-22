package linkedList;

public class DoublyLinkedList<T> {
    NodeForDoubly<T> head;
    NodeForDoubly<T> tail;
    public DoublyLinkedList(){
        head=tail=null;
    }
    public void addToHead(T value){
        if(head==null){
            head=tail=new NodeForDoubly<>(value);
        }else {
            NodeForDoubly<T> temp=new NodeForDoubly<T>(value);
            temp.setNext(head);
            head.setPrevious(temp);
            head=temp;
        }
    }
    public void addToTail(T value){
        if(tail==null){
            tail=head=new NodeForDoubly<>(value);
        }else {
            NodeForDoubly<T> temp=new NodeForDoubly<T>(value);
            temp.setPrevious(tail);
            tail.setNext(temp);
            tail=temp;
        }
    }
    public void deleteFromHead(int index){
        NodeForDoubly<T> temp=head;
        if(index<0){
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");

        }
        if (index==0){
            if(temp==null){
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
            }
            head=head.getNext(); // علشان لو ال index = 0 هو ال head ميحصلش ايرور
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.getNext() == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
            }
            temp.getPrevious().setNext(temp.getPrevious()); // يعني ال privious بتاعي حط ال next الي بعدي ب privious بتاعي
            temp.getNext().setPrevious(temp.getPrevious()); // يعني ال next بتاعي حط ال privious بتاعه ب privious بتاعي
        }

    }
    public void deleteFromTail(int index)throws IndexOutOfBoundsException{
        NodeForDoubly<T> temp=tail;
        if(index<0){
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");

        }
        if(temp==null){
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
        }

        for (int i = 0; i < index ; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
            }
            temp=temp.getPrevious();

        }
        if (temp == tail) {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.setNext(null);
            }
        }

        // إذا كانت هذه هي الرأس
        else if (temp.getPrevious() == null) {
            head = temp.getNext();
            if (head != null) {
                head.setPrevious(null);
            }
        }
        else {
            temp.getPrevious().setNext(temp.getNext()); // يعني ال privious بتاعي حط ال next الي بعدي ب privious بتاعي
            temp.getNext().setPrevious(temp.getPrevious()); // يعني ال next بتاعي حط ال privious بتاعه ب privious بتاعي

        }

    }
    public void printFromHead(){
        NodeForDoubly<T> temp=head;
        while (temp!=null){
            System.out.println(temp.getValue());
            temp=temp.getNext();

        }
    }
    public void printFromTail(){
        NodeForDoubly<T> temp=tail;
        while (temp!=null){
            System.out.println(temp.getValue());
            temp=temp.getPrevious();

        }
    }
}

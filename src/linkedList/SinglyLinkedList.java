package linkedList;

public class SinglyLinkedList <T>{
    Node<T> head;
    public SinglyLinkedList(){
        head=null;
    }
    public void setHead(T value){
        if(head==null){
            head=new Node<>(value);
        }else {
            Node<T> tempNode=new Node<>(value);
            tempNode.setNext(head);
            head=tempNode;
        }
    }
    public void deleteValue(T value){
        Node<T> temp=head;
        if(head==null) {
            throw new IndexOutOfBoundsException("List Is Empty");
        }
        if (head.getValue().equals(value)){
            head=head.getNext();
            return;
        }
        while (temp.getNext()!=null&& !temp.getNext().getValue().equals(value)){
            temp=temp.getNext();
        }
        if(temp.getNext()==null){
            throw new IndexOutOfBoundsException("Value " + value + " Not Found in The List");

        }
        temp.setNext(temp.getNext().getNext());

    }

    public void delete(int index){ // index --> K
        Node<T> temp=head;

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
            temp = temp.getNext();
        }

        Node<T> temp2=temp.getNext();
            if (temp2==null){
                throw new IndexOutOfBoundsException("Index " + index + " is out of range");
            }
            else {
                temp.setNext(temp2.getNext());
            }
        }

    public void print(){
        Node<T> temp=head;
        while (temp!=null){
            System.out.println(temp.getValue());
            temp=temp.getNext();

        }
    }
}
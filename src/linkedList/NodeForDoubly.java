package linkedList;

public class NodeForDoubly <T>{
    T value;
    NodeForDoubly<T> next;
    NodeForDoubly<T> prevous;

    public NodeForDoubly(T value){
        this.value=value;
        next=prevous=null;
    }
    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return  value;
    }
    public void setNext(NodeForDoubly<T> next){
        this.next=next;
    }
    public NodeForDoubly<T> getNext(){
        return next;
    }
    public void setPrevious(NodeForDoubly<T> prevous){
        this.prevous=prevous;
    }
    public NodeForDoubly<T> getPrevious(){
        return prevous;
    }


}

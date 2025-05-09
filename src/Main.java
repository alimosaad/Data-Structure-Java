import Dictionary.Dictionary;
import Queue.Queue;
import Stack.Stack;
import linkedList.DoublyLinkedList;
import linkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //region QueueExample
        /*try {
            queue.Dequeue();
            queue.printQueue();
            queue.Enqueue(6);
            queue.Enqueue(7);

            queue.printQueue();
            System.out.println("Queue Size Is: "+queue.size());
            queue.Dequeue();
            queue.Dequeue();
            queue.printQueue();
            
            System.out.println("Queue Size Is: "+queue.size());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Done");
        }*/
        //endregion

        //region StackExample
        /*Stack<Integer> stack=new Stack<Integer>();
        for (int i=1; i<=5;i++){
            stack.push(i);
        }
        try {
            stack.pop();
            stack.pop();
            stack.print();
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Done");
        }*/
        //endregion

        Dictionary<String,String> dictionary=new Dictionary<String,String>();

        try {
           //dictionary.print();
            if(dictionary.remove("Ali")==false){
                System.out.println("This User Doesn't Exist In Dictionary");
            }else {
                System.out.println("This User Has Been Deleted Successfully");
            }

            //dictionary.print();
            dictionary.setEntries("Ali", "Ali@gmail.com");
            dictionary.print();
            dictionary.setEntries("Ali", "Ali@gmail.com");
            dictionary.print();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
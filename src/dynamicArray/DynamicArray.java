package dynamicArray;

public class DynamicArray <T>{
    private Object[] array;
    private int numOfItem;
    public DynamicArray(){
        array=new Object[2];
        numOfItem=0;
    }
    public void addItem(T num){
        if (numOfItem==array.length)
            resize();
        array[numOfItem]=num;
        numOfItem++;
    }

    public void resize(){
        Object[] newArray=new Object[array.length*2];
        for(int i =0;i<numOfItem;i++){
            newArray[i]=array[i];

        }
        array=newArray;

    }
    public int size(){
        return numOfItem;
    }
}

package arrays;

import java.util.Arrays;

public class ResizeArray{

    public <T> T[] resiz(T[] original, int newSize,int end){
        if (newSize<0) return null;
        if (original == null) return null;
        if (original.length==newSize) return null;
        T[] newArray= Arrays.copyOfRange(original,newSize,end);
        original=newArray;
        return original;
    }
}

package Dictionary;

public class Dictionary<TKey ,TValue> {
    KeyValuePair[] entries;
    int intialSize;
    int entriesCount;
    public Dictionary(){
        this.intialSize=3;
        this.entries=new KeyValuePair[this.intialSize];
    }
    public void reSize(){
        if (this.entriesCount<this.entries.length-1){
            return;
        }
        int newSize=this.entries.length+intialSize;
        KeyValuePair[] newArray=new KeyValuePair[newSize];
    }
}

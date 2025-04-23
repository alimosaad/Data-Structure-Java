package Dictionary;

public class Dictionary<TKey ,TValue> {
    KeyValuePair[] entries;
    int intialSize;
    int entriesCount=0;
    public Dictionary(){
        this.entries= new KeyValuePair[this.intialSize];
    }

    public void reSize(){
        if (this.entriesCount<this.entries.length){
            return; // mean that don't resize and exit else
        }
        int newSize=this.entries.length+1;
        KeyValuePair[] newArray=new KeyValuePair[newSize];
        System.arraycopy(entries, 0, newArray, 0, entries.length);
        entries = newArray;
    }
    public int getSize(){
        return this.entriesCount;
    }
    public void setEntries(TKey key,TValue value) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null && entries[i].key.equals(key)) {
                entries[i].value = value;
                //if user has already existed print 
                System.out.println("This User already exist");
                return;
            }
        }
            reSize();
            entries[entriesCount++] = new KeyValuePair<>(key, value);

    }
    public void print() {
            System.out.println("size: " + getSize());

                if (IsEmpty()) {
                    throw new IndexOutOfBoundsException("Not Found Dictionary Is Empty!!");
                } else {
                    for (int i = 0; i < entries.length; i++) {
                        if(entries[i]==null){
                            return;
                        }
                        System.out.println((i + 1) + " -> " + entries[i].key + ":" + entries[i].value);
                    }
                }


        }
    public boolean IsEmpty() {
        return entriesCount==0;
    }
    @SuppressWarnings("unchecked")
    public TValue getEntries(TKey key) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null && entries[i].key.equals(key)) {
                return (TValue) entries[i].value;
            }
        }
        throw new RuntimeException("Key You Entered Not Found In Dictionary");
    }
    public Boolean remove(TKey key) {
        for (int i = 0; i < entriesCount; i++) {
            if (entries[i] != null && entries[i].key.equals(key)) {
                for (int j = i; j < entriesCount - 1; j++) {
                    entries[j] = entries[j + 1];
                }
                entries[--entriesCount] = null;
                return true;
            }
        }
        return false;
    }






}

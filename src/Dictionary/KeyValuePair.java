package Dictionary;

class KeyValuePair<TKey , TValue>{
    TKey key;
    TValue value;
    public KeyValuePair(TKey key,TValue value){
        this.key=key;
        this.value=value;
    }
    public TKey getKey(){
        return key;
    }
    public TValue getValue(){
        return value;
    }
    public void setValue(TValue value){
        this.value=value;
    }
}
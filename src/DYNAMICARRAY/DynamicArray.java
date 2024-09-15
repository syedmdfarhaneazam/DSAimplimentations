package DYNAMICARRAY;
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array =new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        array[size]=data;
        size++;
    }

    public void insert(int index, Object data){
        if(size>=capacity){grow();}
        for(int i= size; i<index;i--){
            array[i] =array[i-1];
            size++;

        }
        array[index]= data;
        
    }

    public int search(Object data){
        for(int i=0;i<size;i++){
            if(array[i]== data){
                return i;
            }
        }
        return -1;
    }

    public void delete(Object data){
        for(int i=0;i<size ;i++){
            if(array[i]==data){
                for(int j=0;j<size-i-1;j++){
                    array[j+i]=array[i+j+1];
                }
                array[size-1]= null;
                size--;
                if(size<=capacity/2){shrink();}
            }
        }
    }

    private void grow(){
        int newCapacity= (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        capacity=newCapacity;
        array=newArray;
    }

    private void shrink(){
        int newCapacity= (int)(capacity/22);
        Object[] newArray = new Object[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];

        }
        capacity=newCapacity;
        array=newArray;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        String S ="";
        for(int i=0;i<size;i++){
            S += array[i]+",";
        }
        if(S!=""){
            S="["+S.substring(0,S.length()-1)+"]";
        }
        else S="[]";
        return S;
    }
}
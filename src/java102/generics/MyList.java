package java102.generics;

import java.util.Arrays;
import java.util.LinkedList;

public class MyList <T>{
    private int capacity;
    private T[] arr;
    private int size=size();
    private static final int defaultCapacity=10;

    public MyList(){
        this.capacity=defaultCapacity;
        arr=(T[]) (new Object[defaultCapacity]);
    }
    public MyList(int capacity){
        this.capacity=capacity;
        arr=(T[]) (new Object[capacity]);
    }

    public boolean contains(T data){
        for (T i:arr) {
            if (i==data){
                return true;
            }
        }
        return false;
    }
    public MyList<T> sublist(int start,int finish){
        MyList<T> subArr=new MyList<>();
        subArr.arr=(T[]) (new Object[finish-start+1]);
        int a=0;
        for (int i=start;i<=finish;i++){
            subArr.arr[a]=arr[i];
            a++;
        }
        System.out.println(Arrays.toString(subArr.arr));
        return subArr;
    }
    public void clear(){
        arr=(T[]) (new Object[defaultCapacity]);
    }

    public T[] toArray(){
        T[] arr2=(T[]) (new Object[capacity]);
        for (int i=0;i<size;i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public int lastIndexOf(T data){
        for(int i=size;i>0;i--){
            if (arr[i]==data){
                return (size-i);
            }
        }
        return -1;
    }

    public int indexOf(T data){
        int r=-1;
        for(int i=0;i<size;i++){
            if (arr[i]==data){
              r=i;
            }
        }
        return r;
    }
    public String toString(T[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(",");
            }
        }
        return "";
    }
    public String toString(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]);
            if(i!=size-1){
                System.out.print(",");
            }
        }
        return "";
    }

    public T set(int index, T data){
        if(index<0||index> arr.length){
            return null;
        }
        arr[index]=data;
        return data;
    }
    public T remove(int index){
        if(index<0||index> arr.length){
            return null;
        }
        for (int j = index; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
        return arr[index];
    }
    public T get(int index){
        if(index<0||index> arr.length){
            return null;
        }
        T value=arr[index];
        return value;
    }
    public int getCapacity(){
      return capacity;
    }
    public void add(T data){
        if (size==capacity){
            resize();
        }
        arr[size]=data;
        size++;
       // System.out.println(Arrays.toString(this.arr));
    }
    public void resize(){
        T[] newArr=(T[]) (new Object[capacity*2]);
        for (int i=0;i<capacity;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
        this.capacity=capacity*2;
    }
    public int size(){
        int k=0;
        int m=0;
        if (this.arr==null){
            k=0;
            return k;
        }
        for(int i=0;i<this.capacity;i++){
            if (this.arr[i]==null){
                m++;
            }
        }
        k=arr.length-m;

        return k;
    }


}

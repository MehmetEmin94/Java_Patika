package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList=new MyList<>();

        System.out.println("Element number of an array : "+myList.size());
        System.out.println("Capacity of an array : "+myList.getCapacity());
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Element number of an array : "+myList.size());
        System.out.println("Capacity of an array : "+myList.getCapacity());
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);
        System.out.println("Element number of an array : "+myList.size());
        System.out.println("Capacity of an array : "+myList.getCapacity());
        System.out.println("2. indisteki değer : " + myList.get(0));
        System.out.println(myList.remove(1));
        System.out.println(myList.set(1,50));
        System.out.println(myList.toString());
        System.out.println(myList.indexOf(40));
        System.out.println(myList.lastIndexOf(40));
        System.out.println(myList.isEmpty());
        System.out.println(Arrays.toString(myList.toArray()));

        myList.sublist(5,6);
        System.out.println(myList.contains(200));
        myList.clear();







    }
}

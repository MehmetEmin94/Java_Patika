package java101_arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements {
    public static void main(String[] args) {
        int size=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array size : ");
        size=scan.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter value : ");
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sort by min to max : ");
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
}

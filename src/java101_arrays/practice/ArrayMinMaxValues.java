package java101_arrays.practice;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValues {
    public static void main(String[] args) {
        int[] arr={15,12,788,1,-1,-778,2,0};

        int min=0;
        int max=0;
        int smax=0;
      /*  for (int i:arr) {
            if(i>max){
                max=i;
            }
        }
        for (int i:arr) {
            if(i<min){
                min=i;
            }
        }
        System.out.println("minimum value of array : "+min);
        System.out.println("maximum value of array : "+max);*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=scan.nextInt();

        for (int i:arr) {
            if(i>max){
                max=i;
            }
            if(i<num){
                if(i>smax){
                    smax=i;
                }
            }
            if(i>num){
                if(i<max){
                    min=i;
                }
            }

        }

        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Entered number : "+num);
        System.out.println("maximum number which smaller entered number : "+smax);
        System.out.println("minimum number which bigger entered number : "+min);
    }
}

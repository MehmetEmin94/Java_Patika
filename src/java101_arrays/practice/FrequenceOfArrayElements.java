package java101_arrays.practice;

import java.util.Arrays;

public class FrequenceOfArrayElements {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int[] arr={10,20,20,10,10,20,5,20};
        int[] result = new int[8];
        for (int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                result[x++] = arr[i];
            }
        }
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("How many times repeat");
        for (int i = 0; i < x; i++) {
            y = 0;
            for (int j = 0; j < arr.length; j++) {
                if (result[i] == arr[j]) {
                    y++;
                }

            }
            System.out.println(result[i] + " number " + y+" times repeat");

        }

    }
}

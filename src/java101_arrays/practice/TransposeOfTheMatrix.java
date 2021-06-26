package java101_arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfTheMatrix {
    public static void main(String[] args) {

        int[][] arr=new int[2][3];
        int[][] transpose=new int[3][2];

        Scanner scan=new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter matrix element : ");
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }System.out.println("");
        }
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose : ");
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println("");
        }

    }
}

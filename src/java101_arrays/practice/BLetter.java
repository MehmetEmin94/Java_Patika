package java101_arrays.practice;

import java.util.Arrays;

public class BLetter {
    public static void main(String[] args) {
        String[][] arr=new String[7][4];

        for (int i=0;i<arr.length;i++){
            arr[i][0]=" *";
            arr[i][3]="* ";
            for (int j=0;j<arr[i].length;j++){

                if(i==0||i==3||i==6){
                    arr[i][j]=" * ";
                }else if (i>0&&i< arr.length&&j>0&&j< arr[i].length-1){
                    arr[i][j]="    ";
                }
            }
        }
        for (String[] row:arr) {
            for (String col:row){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}

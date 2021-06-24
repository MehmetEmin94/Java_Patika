package java101;

import java.util.Scanner;

public class ExponentialNumberCalculate {
    public static void main(String[] args) {

        int num1,num2,result=1;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num1=scan.nextInt();

        System.out.println("Enter a number : ");
        num2=scan.nextInt();

//        int j=0;
//        while (j<num2){
//            j++;
//            result*=num1;
//
//        }System.out.println(result);
        for(int i=0;i<num2;i++){
            result*=num1;
        }System.out.println(result);


    }
}

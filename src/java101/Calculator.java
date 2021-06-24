package java101;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int total;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number : ");
        int number_1= scan.nextInt();

        System.out.println("Enter second number : ");
        int number_2=scan.nextInt();

        System.out.println("Enter operation (* , / , + , - ) : ");
        String operator= scan.next();
        switch (operator){
            case "*":
                total=number_1*number_2;
                System.out.println("Total : "+total);
                break;
            case "/":
                switch (number_2){
                    case 0:
                        System.out.println("Number can not devide by zero.Please try again");
                        break;
                    default:
                        total=number_1/number_2;
                        System.out.println("Total : "+total);
                }break;

            case "+":
                total=number_1+number_2;
                System.out.println("Total : "+total);
                break;
            case "-":
                total=number_1-number_2;
                System.out.println("Total : "+total);
                break;
            default:
                System.out.println("Please try again..");

        }
    }
}

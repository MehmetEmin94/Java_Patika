package java101;

import java.util.Scanner;

public class AdvancedCalculator {
    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number,result=0,i=1;
        while(true){
            System.out.print(i++ +".number : ");
            number=scan.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Result : "+result);
    }
    static void minus(){
        Scanner scan = new Scanner(System.in);
        int number,result=0,i=1;
        System.out.print(i++ +".number : ");
        number=scan.nextInt();
        result=number;
        while(true){
            System.out.print(i++ +".number : ");
            number=scan.nextInt();
            if (number==0){
                break;
            }

            result-=number;
        }
        System.out.println("Result : "+result);
    }
    static void multiply(){
        Scanner scan = new Scanner(System.in);
        int number,i=1,result=1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void division(){
        Scanner scan = new Scanner(System.in);
        System.out.print("how many numbers to enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Dividing can not enter zero");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);

    }
    static void exponentCalculation(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base = scan.nextInt();
        System.out.print("Enter exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }
    static void factorialCalculation(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    static void modeRetrieval(){
        Scanner scan = new Scanner(System.in);
        int num,mode;
        System.out.print("enter first number :");
        num= scan.nextInt();
        System.out.print("enter second number :");
        mode = scan.nextInt();
        while (num>=mode){
            num-=mode;
        }
        System.out.println("Mode : "+num);
    }
    static void rectangularArea_and_Perimeter(){
        Scanner scan = new Scanner(System.in);
        int firstSide,secondSide,area,perimeter;
        System.out.print("enter first side :");
        firstSide= scan.nextInt();
        System.out.print("enter second side :");
        secondSide= scan.nextInt();
        area=firstSide*secondSide;
        perimeter=2*(firstSide+secondSide);
        System.out.println("area : "+area+"\nperimeter : "+perimeter);
    }
    public static void main(String[] args) {

        int cal;
        Scanner scan=new Scanner(System.in);



        do {
            System.out.println("\nChoose Calculation : \n1-Plus\n2-Minus\n3-Multiply\n4-Divided\n5-Exponent\n6-Factorial\n7-Mode Retrieval\n8-Rectangular Area and Perimeter\n0-Exit");
           cal=scan.nextInt();
            switch (cal){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentCalculation();
                    break;
                case 6:
                    factorialCalculation();
                    break;
                case 7:
                    modeRetrieval();
                    break;
                case 8:
                    rectangularArea_and_Perimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid entering.Try again.");
            }
        }while(cal!=0);



    }
}

package java101;

import java.util.Scanner;

public class GcdLcmCalculate {
    public static void main(String[] args) {
        int number1,number2,gcd,lcm=1;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number : ");
        number1=scan.nextInt();
        System.out.println("Enter second number : ");
        number2=scan.nextInt();



        /*if(number1<=number2){
            for (int i=number1;i>=1;i--){
                if(number1%i==0&&number2%i==0){
                    gcd=i;
                    System.out.println("Greatest common divisor : "+gcd);

                    lcm=number1*number2/gcd;
                    System.out.println("Least common multiple : "+lcm);
                    break;

                }
            }
        }else{
            for (int i=number2;i>=1;i--){
                if(number1%i==0&&number2%i==0){
                    gcd=i;
                    System.out.println("Greatest common divisor : "+gcd);

                    lcm=number1*number2/gcd;
                    System.out.println("Least common multiple : "+lcm);
                    break;

                }
            }
        }*/
        if(number1<=number2){
        int a=number1;
        while (a>=1){
            if(number1%a==0&&number2%a==0){
                gcd=a;
                System.out.println("Greatest common divisor : "+gcd);

                lcm=number1*number2/gcd;
                System.out.println("Least common multiple : "+lcm);
                break;

            }a--;

        }
        }
        else{
            int a=number2;
            while (a>=1){
                if(number1%a==0&&number2%a==0){
                    gcd=a;
                    System.out.println("Greatest common divisor : "+gcd);

                    lcm=number1*number2/gcd;
                    System.out.println("Least common multiple : "+lcm);
                    break;

                }a--;

            }
        }




    }
}

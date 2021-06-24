package java101;

import java.util.Scanner;

public class PrimeNumbersRecursive {
    static boolean isPrime(int number,int i){
        if(number<=2)
            return (number==2)?true:false;

        if(number%i==0)
            return false;
        if (i*i>number)
            return true;
        return isPrime(number,i+1);
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number= scan.nextInt();

        if(isPrime(number,2)){
            System.out.println(number+" is a prime");
        }else {
            System.out.println(number+" is not a prime");
        }


    }
}

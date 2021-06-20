import java.util.Scanner;

public class FactorialAndCombination {
    public static void main(String[] args) {

        int num,result,factorial=1,factorialFirst=1,factorialThird=1,factorialSecond=1;
        Scanner scan=new Scanner(System.in);
/*
        System.out.println("Enter a number : ");
        num=scan.nextInt();

        for(int i=1;i<=num;i++){
            factorial*=i;

        } System.out.println(factorial);*/

        System.out.println("Enter first element : ");
        int firstElement= scan.nextInt();

        System.out.println("Enter second element : ");
        int secondElement= scan.nextInt();

        if(firstElement>secondElement){
            for(int i=1;i<=firstElement;i++){
                factorialFirst*=i;
            }
            for(int i=1;i<=secondElement;i++){
                factorialSecond*=i;
            }
            for(int i=1;i<=(firstElement-secondElement);i++){
                factorialThird*=i;
            }
            result=factorialFirst/(factorialSecond*factorialThird);
            System.out.println(result);
        }else if(firstElement==secondElement){
            result=1;
            System.out.println(result);
        }else{
            System.out.println("Second element can not bigger than first element.Please try again. ");
        }
    }
}

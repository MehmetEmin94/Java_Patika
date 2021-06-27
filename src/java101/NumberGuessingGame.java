package java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int right=0;
        int entered;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        while (right<5){
            System.out.println("Enter your "+(right+1)+". guess : ");
            entered= scan.nextInt();
            if (entered<0||entered>99){
                System.out.println("Please enter number between 0-100!");

                continue;
            }
            if (entered==number){
                System.out.println("Congratulations right guess."+"[ "+number+" ]");
                isWin=true;
                break;
            }else {
                System.out.println("Wrong guess !");
                if (entered<number){
                    System.out.println(entered+" is less than the required number.");
                }else {
                    System.out.println(entered+" The number you entered is more than the required number.");
                }

                System.out.println("You have "+(5-right)+" trying.");
            }
            wrong[right]=entered;
            right++;

        }


        if (!isWin){
            System.out.println("You loss");

        }System.out.println("Previous guesses"+ Arrays.toString(wrong));

    }
}

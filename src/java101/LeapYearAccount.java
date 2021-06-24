package java101;

import java.util.Scanner;

public class LeapYearAccount {
    public static void main(String[] args) {

        int year;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Year : ");
        year=scanner.nextInt();


            if(year%100==0&&year%400==0||year%100!=0&&year%4==0){
                System.out.println(year+ " is a leap year!");
            }else {
                System.out.println(year+ " is not a leap year!");
            }


    }
}

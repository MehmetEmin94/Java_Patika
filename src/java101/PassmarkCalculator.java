package java101;

import java.util.Scanner;

public class PassmarkCalculator {
    public static void main(String[] args) {

        int math,physic,turkish,chemistry,music;
        double average;
        Scanner scan=new Scanner(System.in);

        System.out.println("enter math score : ");
        math=scan.nextInt();

        System.out.println("enter physic score : ");
        physic=scan.nextInt();

        System.out.println("enter turkish score : ");
        turkish=scan.nextInt();

        System.out.println("enter chemistry score : ");
        chemistry=scan.nextInt();

        System.out.println("enter music score : ");
        music=scan.nextInt();

        if(math>=0&&physic>=0&&turkish>=0&&chemistry>=0&&music>=0&&
                math<=100&&physic<=100&&turkish<=100&&chemistry<=100&&music<=100){
            average=(math+physic+turkish+chemistry+music)/5.00;
            if (average>=55){
                System.out.println("Average score : "+average);
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Average score : "+average);
                System.out.println("Could not pass");
            }

        }
        else
        {
            System.out.println("Please enter valid score!");
        }


    }
}

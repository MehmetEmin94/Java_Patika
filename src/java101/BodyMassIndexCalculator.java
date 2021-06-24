package java101;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter height(meter) : ");
        double height=scan.nextDouble();

        System.out.println("Enter weight(kg) : ");
        double weight=scan.nextDouble();

        double index=weight/Math.pow(height,2);
        System.out.println("Your body mass index is : "+index);
    }
}

package java101;

import java.util.Scanner;

public class CircleAreaAndPerimeterCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter circle radius : ");
        double radius=scan.nextDouble();

        System.out.println("Enter circle radius : ");
        double degree=scan.nextDouble();


        double area=Math.PI*Math.pow(radius,2)*degree/360;
        System.out.println("Area of circle : "+area);

        double perimeter=Math.PI*2*radius;
        System.out.println("Perimeter of circle : "+perimeter);
    }
}

package java101;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first steep edge : ");
        int firstEdge=scan.nextInt();
        System.out.println("Please enter first steep edge : ");
        int secondEdge= scan.nextInt();

        double hypotenuse=Math.sqrt((firstEdge*firstEdge)+(secondEdge*secondEdge));
        System.out.println(hypotenuse);
    }
}

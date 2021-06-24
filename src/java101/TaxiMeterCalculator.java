package java101;

import java.util.Scanner;

public class TaxiMeterCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter distance(km) :");
        double kilometer=scan.nextDouble();

        double startPrice=10.0;

        double price=startPrice+(2.20*kilometer);

        price=price<20.0?20.0:price;

        System.out.println("Price : "+price);



    }
}

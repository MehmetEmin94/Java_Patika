package java101;

import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        System.out.println("Please enter price : ");
        double price=read.nextDouble();
        System.out.println("Price without kdv : "+price);

        double kdvRate=price>0&&price<1000?0.18:0.08;
        double priceWithKdvRate=price+(price*kdvRate);
        System.out.println("Price with kdv : "+priceWithKdvRate);
        System.out.println("Kdv rate : "+price);
    }
}

package java101;

import java.util.Scanner;

public class PlaneTicketCalculator {
    public static void main(String[] args) {
        int distance,age,ticketType;
        double priceByKm=0.10,totalPrice;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Distance (km) : ");
        distance=scanner.nextInt();

        System.out.println("Enter Age : ");
        age=scanner.nextInt();

        System.out.println("1-One direction\n2-Double direction\nEnter Ticket Type : ");
        ticketType=scanner.nextInt();

        totalPrice=distance*priceByKm;

        if(distance>0&&age>0&&ticketType>=1&&ticketType<=2)
        {
            if (ticketType==2){
                totalPrice=2*totalPrice*80/100;
                if(age<=12)
                {
                    totalPrice=totalPrice*50/100;
                    System.out.println(totalPrice);
                }
                else if(age>12&&age<=24)
                {
                    totalPrice=totalPrice*90/100;
                    System.out.println(totalPrice);
                }
                else if(age>65)
                {
                    totalPrice=totalPrice*70/100;
                    System.out.println(totalPrice);
                }else {
                    System.out.println(totalPrice);
                }
            }
            else
            {
                if(age<=12)
                {
                    totalPrice=totalPrice*50/100;
                    System.out.println(totalPrice);
                }
                else if(age>12&&age<=24)
                {
                    totalPrice=totalPrice*90/100;
                    System.out.println(totalPrice);
                }
                else if(age>65)
                {
                    totalPrice=totalPrice*70/100;
                    System.out.println(totalPrice);
                }else {
                    System.out.println(totalPrice);
                }
            }

        }
        else
        {
            System.out.println("You Entered Wrong Data!");
        }
    }
}

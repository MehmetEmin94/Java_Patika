import java.util.Scanner;

public class GreenGrocerCashiersDesk {
    public static void main(String[] args) {
        double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananaPrice=0.95,eggplantPrice=5.00;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pear kg : ");
        double pear= scan.nextDouble();

        System.out.println("Enter apple kg : ");
        double apple= scan.nextDouble();

        System.out.println("Enter tomato kg : ");
        double tomato= scan.nextDouble();

        System.out.println("Enter banana kg : ");
        double banana= scan.nextDouble();

        System.out.println("Enter eggplant kg : ");
        double eggplant= scan.nextDouble();

        double total=(pearPrice*pear)+(applePrice*apple)+(tomato*tomatoPrice)+(banana*bananaPrice)+(eggplant*eggplantPrice);
        System.out.println("Total price : "+total);

    }
}

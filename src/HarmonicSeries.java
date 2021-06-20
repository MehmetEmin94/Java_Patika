import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        double num;
        double result=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scan.nextInt();

        for (double i=1;i<=num;i++){
            result+=(1/i);
        }System.out.println(result);
    }
}

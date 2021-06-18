import java.util.Scanner;

public class TriangelAreaCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first edge :");
        int edge_1=scan.nextInt();

        System.out.println("Enter second edge :");
        int edge_2=scan.nextInt();

        System.out.println("Enter third edge :");
        int edge_3=scan.nextInt();

        double u=(edge_1+edge_2+edge_3)/2;

        double area=Math.sqrt(u*(u-edge_1)*(u-edge_2)*(u-edge_3));
        System.out.println("Triangle Area : "+area);
    }
}

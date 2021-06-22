import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num,n1=0,n2=1,n3;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scanner.nextInt();

        System.out.println(" "+n1);
        System.out.println(" "+n2);

        for (int i=1;i<num;i++) {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }


    }
}

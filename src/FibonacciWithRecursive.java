import java.util.Scanner;

public class FibonacciWithRecursive {
    static int Fibonacci(int value){
        if (value<0)
        {
            return -1;
        }
        else if (value==0)
        {
            return 0;
        }
        else if (value<=2)
        {
            return 1;
        }
        else
        {
            return Fibonacci(value-1)+ Fibonacci(value - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter nth term : ");
        int scan=scanner.nextInt();
        int res=Fibonacci(scan);
        if (res==-1){
            System.out.println("You entered wrong term.Please enter zero or positive numbers");
        }
        else {
            System.out.println("Result : "+res);
        }
    }
}

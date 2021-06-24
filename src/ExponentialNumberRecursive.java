import java.util.Scanner;

public class ExponentialNumberRecursive {

    static int exp(double res,int num1,int num2){
        if(num2>0){
            res*=num1;
            num2--;
            if (num2==0){
                System.out.println(res);
            }
        }else if(num2==0){
            return 1;
        }else if(num2<0){
            res=res/num1;
            num2++;
            if (num2==0){
                System.out.println(res);
            }

        }
        return exp(res,num1,num2);
    }
    public static void main(String[] args) {

        double res=1;int num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter base number : ");
        num1= scan.nextInt();

        System.out.println("Enter exponential number : ");
        num2= scan.nextInt();

        if(num2==0){
            System.out.println(1);
        }else { exp(res,num1,num2);}

    }
}

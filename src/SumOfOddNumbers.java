import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {


        int num,sum=0;
        Scanner scan=new Scanner(System.in);

       /* do{
            System.out.println("Enter a number : ");
            num=scan.nextInt();
            if(num%2==1){
                sum+=num;

            }
        }while (num>0);
        System.out.println("Sum : "+sum);*/


        do{
            System.out.println("Enter a number : ");
            num=scan.nextInt();
            if(num%4==0){
                sum+=num;
            }
        }while(num%2==0);

        System.out.println("Sum : "+sum);
    }
}

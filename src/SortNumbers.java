import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        int first,second,third;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number : ");
        first=scan.nextInt();

        System.out.println("Enter second number : ");
        second=scan.nextInt();

        System.out.println("Enter third number : ");
        third=scan.nextInt();

       /* if(first>second&&second>third){
            System.out.println(first+" > "+second+" > "+third);
        }else if (second>first&&first>third){
            System.out.println(second+" > "+first+" > "+third);
        }else if (third>first&&first>second){
            System.out.println(third+" > "+first+" > "+second);
        }else if (third>second&&second>first){
            System.out.println(third+" > "+second+" > "+first);
        }else if (second>third&&third>first){
            System.out.println(second+" > "+third+" > "+first);
        }else {
            System.out.println(first+" > "+third+" > "+second);
            }*/

        if(first>second&&second>third){
            System.out.println(third+" < "+second+" < "+first);
        }else if (second>first&&first>third){
            System.out.println(third+" < "+first+" < "+second);
        }else if (third>first&&first>second){
            System.out.println(second+" < "+first+" < "+third);
        }else if (third>second&&second>first){
            System.out.println(first+" < "+second+" < "+third);
        }else if (second>third&&third>first){
            System.out.println(first+" < "+third+" < "+second);
        }else {
            System.out.println(second+" < "+third+" < "+first);
        }


    }
}

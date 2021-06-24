package java101;

import java.util.Scanner;

public class RootsOf2 {
    public static void main(String[] args) {

        int num;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scan.nextInt();
       /* for (int i=1;i<num;i*=2){
            System.out.println("Enter a number : "+i);
        }*/
        for (int i=1;i<num;i*=20){
            System.out.println("Enter a number : "+i);
        }
    }
}

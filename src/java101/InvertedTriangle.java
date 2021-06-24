package java101;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        int digit;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter digit value : ");
        digit=scanner.nextInt();

        for (int i=0;i<digit;i++){
            for (int m=(digit-i);m<digit;m++){
                System.out.print(" ");
            }
            for (int j=2*(digit-i);j>=2;j--){
                System.out.print("*");
            }

            System.out.println("");

        }


    }
}

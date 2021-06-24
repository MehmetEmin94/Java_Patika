package java101;

import java.util.Scanner;

public class TriangleWithAstricts {
    public static void main(String[] args) {

        int size;
        String astricts="*",space=" ";

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter size : ");
        size=scan.nextInt();

        for (int i=0;i<size;i++){

            for (int j=1;j<size-i;j++){
                System.out.print(space);
            }
            for(int m=2*(size-i);m<2*size+1;m++){
                System.out.print(astricts);
            }
            System.out.println("");
        }
        for(int i=0;i<size;i++){

            for(int m=size-i;m<=size;m++){
                System.out.print(space);
            }

            for (int j=3;j<2*(size-i);j++){
                System.out.print(astricts);
            }

            System.out.println("");
        }

    }
}

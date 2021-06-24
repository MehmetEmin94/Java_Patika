package java101;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        double ort;
        Scanner entered=new Scanner(System.in);
        System.out.print("Matematik notu : ");
        double m=entered.nextDouble();
        System.out.print("Fizik notu : ");
        double f=entered.nextDouble();

        System.out.print("Kimya notu : ");
        double k=entered.nextDouble();

        System.out.print("Turkce notu : ");
        double t=entered.nextDouble();

        System.out.print("Tarih notu : ");
        double ta=entered.nextDouble();

        System.out.print("Muzik notu : ");
        double mu=entered.nextDouble();

        ort=(m+f+k+t+ta+mu)/6;
        boolean gecti=(ort>=60.0);
        String a=gecti?" gecti":" kaldi";

        System.out.println(ort+a);


    }
}

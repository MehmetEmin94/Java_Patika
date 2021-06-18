import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        double ort;
        Scanner entered=new Scanner(System.in);
        System.out.print("Matematik notu : ");
        int m=entered.nextInt();
        System.out.print("Fizik notu : ");
        int f=entered.nextInt();

        System.out.print("Kimya notu : ");
        int k=entered.nextInt();

        System.out.print("Turkce notu : ");
        int t=entered.nextInt();

        System.out.print("Tarih notu : ");
        int ta=entered.nextInt();

        System.out.print("Muzik notu : ");
        int mu=entered.nextInt();

        ort=(m+f+k+t+ta+mu)/6.0;
        boolean gecti=(ort>=60.0);
        String a=gecti?" gecti":" kaldi";

        System.out.println(ort+a);


    }
}

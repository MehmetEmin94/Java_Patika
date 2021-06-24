package java101;

import java.util.Scanner;

public class FindArmstrongNumbers {
    public static void main(String[] args) {

        int num,digits=0,oneDigit,result=0,nroot;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scan.nextInt();
        int numBase=num;

        while(numBase!=0){
            oneDigit=numBase%10;
            result+=oneDigit;
            numBase/=10;
        }System.out.println(result);

//        while(numBase!=0){
//
//            numBase/=10;
//            digits++;
//        }
//
//        numBase=num;
//
//        while(numBase!=0){
//            oneDigit=numBase%10;
//            nroot=1;
//            for (int i=1;i<=digits;i++){
//                nroot*=oneDigit;
//            }
//            result+=nroot;
//            numBase/=10;
//
//        }
//        if(num==result){System.out.println(num+" is an armstrong number");}else {System.out.println(num+" is not an armstrong number");}
    }
}

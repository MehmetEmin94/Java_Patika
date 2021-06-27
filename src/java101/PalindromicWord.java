package java101;

import java.util.Scanner;

public class PalindromicWord {
    public static void main(String[] args) {

        String word,reverse="";
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter word :");
        word= scan.nextLine();

        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        if (reverse.equals(word)){
            System.out.println("Word is palindromic");
        }else {
            System.out.println("Word is not palindromic");
        }


    }
}

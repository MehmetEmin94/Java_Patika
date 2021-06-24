package java101;

import java.util.Scanner;

public class ActivitySuggestionForWeather {
    public static void main(String[] args) {

        int degree;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter degree : ");
        degree=scan.nextInt();

        if(degree<=5){
            System.out.println("Skiing good this weather. ");
        }
        else if(degree>5&&degree<=25){
            if(degree<=15&&degree>=10){
                System.out.println("Cinema will be good activity this weather also You can go to picnic  ");
            }

        }else{
            System.out.println("Swimming will be best choice ");
        }

    }
}

import java.util.Scanner;

public class FindPerfectNumber {
    public static void main(String[] args) {

        int num,total=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scan.nextInt();

        for (int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }
        }
        if(num==total){
            System.out.println(num+" is a perfect number");
        }else {
            System.out.println(num+" is not a perfect number");
        }
    }
}

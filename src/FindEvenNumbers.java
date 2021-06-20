import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int num,total=0,count=0;
        double average;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=scan.nextInt();

        for (int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" even number"+" *** ");
            }

            if(i%3==0&&i%4==0&&i!=0){
                count+=1;
                total+=i;


            }
        }average=total/count;
        System.out.println("");
        System.out.println(average+" average");
    }
}

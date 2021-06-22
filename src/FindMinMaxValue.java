import java.util.Scanner;

public class FindMinMaxValue {
    public static void main(String[] args) {

        int num1,total,count=0,max=0,min=0,flag=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("The amount of numbers you will enter : ");
        total=scan.nextInt();

        for(int i=1;i<=total;i++){
            System.out.println(i+"."+" Enter the number : ");
            num1=scan.nextInt();
            if (num1>=0){
                count++;
                max=Math.max(max,num1);
                if(flag==0){
                    min=num1;
                    flag++;
                }else {
                    min= Math.min(min,num1);
                }}
                else {
                count++;
                max=Math.max(max,num1);
                if(flag==0){
                    min=num1;
                    flag++;
                }else {
                    min= Math.min(min,num1);
                }
            }}








        System.out.println("Biggest number : "+max);
       System.out.println("Smallest number : "+min);


    }
}

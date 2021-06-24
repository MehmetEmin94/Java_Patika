import java.util.Scanner;

public class RecursiveExercise {
    static int operation(int num){
        System.out.print(" "+num);
            while (num>0){
                num-=5;
                System.out.print(" "+num);
                while(num<=0){
                    return num;
                }
            }
            return operation(num);
    }
        static int operation2(int first,int sec){

        while (first>=sec){
            return 1;
        }

            while (first<sec){
                first+=5;
                System.out.print(" "+first);

            }
            return operation2(first,sec);
    }



    public static void main(String[] args) {
        int num, first ,sec;
        Scanner scan = new Scanner(System.in);
        System.out.print("N number :");
        num = scan.nextInt();
        sec=num;System.out.print("Output :");
        if (num>0){
            first=operation(num);
            operation2(first,sec);
        }


    }
}

package java101;

public class FindPrimeNumbers {
    public static void main(String[] args) {

        for(int i=2;i<100;i++){
            int num=0;
           for(int j=1;j<=i;j++){
               if (i%j==0){
                   num++;
               }
            }
           if(num==2){
               System.out.println("Prime number"+i);
           }
        }
    }
}

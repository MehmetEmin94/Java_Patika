public class PalindromNumbers {
    static boolean isPalindrom(int num){
    int temp=num,reverseNum=0,lastDigit;
    while (temp!=0){
        lastDigit=temp%10;
        reverseNum=(reverseNum*10)+lastDigit;
        temp/=10;
    }
    if(num==reverseNum){
        System.out.println(reverseNum);
        return true;
    }else {
        System.out.println(reverseNum);
        return false;
    }

    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(75));
    }
}

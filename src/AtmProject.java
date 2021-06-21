import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName,password;
        Scanner scan=new Scanner(System.in);

        int right=3,select,balance=0;

        while(right>0) {
            System.out.println("User name : ");
            userName=scan.nextLine();

            System.out.println("Password : ");
            password=scan.nextLine();

            switch (userName){
                case "java":
                    switch (password){
                        case "spring":
                            System.out.println("Login successful");
                            do{
                                System.out.println("1-Deposit money\n" +
                                        "2-Withdraw money\n" +
                                        "3-Balance inquiry\n" +
                                        "4-Exit");
                                System.out.println("Please choose operation :");
                                select=scan.nextInt();
                                switch (select){
                                    case 1:
                                        System.out.println("Amount of money :");
                                        int moneyIn=scan.nextInt();
                                        balance+=moneyIn;
                                        break;
                                    case 2:
                                        System.out.println("Amount of money :");
                                        int moneyOut=scan.nextInt();
                                        if (moneyOut>balance){
                                            System.out.println("Balance is not enough :");
                                        }else {
                                            balance-=moneyOut;
                                        }break;
                                    case 3:
                                        System.out.println("Your balance value : "+balance);
                                        break;
                                    default:break;
                                }
                            }while (select!=4);
                            System.out.println("See you later.");
                            break;
                        default:
                            System.out.println("Wrong password.try again.");
                    }break;
                default:
                    switch (password){
                        case "spring":
                          System.out.println("Wrong username.try again.");
                            break;
                        default:
                            System.out.println("Wrong username and password.try again.");
                    }break;

            }

        }

    }
}

import java.util.Scanner;

public class LoginSim {
    public static void main(String[] args) {

        String newPassword;
        String name,password;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter user name : ");
        name=scan.nextLine();

        System.out.println("Enter password : ");
        password=scan.nextLine();



        if(name.equals("someone")&&password.equals("todo")){
            System.out.println("Login success.");
        }else{
            System.out.println("Password not correct.\n1-Try again\n2-Change password");
            int answer= scan.nextInt();
            switch (answer){
                case 1:
                System.out.println("Please try again.");
                break;
                case 2:
                    Scanner scanner=new Scanner(System.in);
                System.out.println("Enter new password");
                newPassword= scanner.nextLine();
                if (newPassword.equals("todo"))
                {
                    System.out.println("Could not create password, please enter another password.");
                }
                else
                {
                    System.out.println("Password created");
                }
                break;
                default:
                    System.out.println("Invalid answer");
            }
        }

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter User: ");
        userName = inp.nextLine();

        System.out.println("Enter Password: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Logged In");

        } else {
            System.out.println("Your Information Is Wrong!");
            System.out.println("Would You Like To Reset Your Password? (Y/N)");
            String answer = inp.nextLine();

            if (answer.equals("Y")) {
                System.out.print("Enter Your New Password: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Could Not Create Password, Please Enter Another Password");
                } else {
                    System.out.println("Password Created");
                }
            } else {
                System.out.println("Password Creation Canceled");
            }
        }
    }

}

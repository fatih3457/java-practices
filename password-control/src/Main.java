import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("User Name: ");
        userName = inp.nextLine();

        System.out.print("Password: ");
        password = inp.nextLine();

        if (userName.equals("path") && password.equals("java123")) {
            System.out.print("You Are Logged In");
        } else {
            System.out.print("Your Information Is Wrong !");
        }
    }

}

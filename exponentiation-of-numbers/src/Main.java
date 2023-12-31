import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Limit Number: ");
        n = inp.nextInt();

        System.out.println("Powers of 4");
        for (int i = 1; i <=n; i*=4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5");
        for (int a = 1; a <=n; a*=5) {
            System.out.println(a);
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter n: ");
        n = inp.nextInt();

        System.out.println("Enter r: ");
        r = inp.nextInt();

        if (r > n ) {
            System.out.print("r, cannot be greater than n");
        } else {
            long combination = 1;

            for (int i = 1; i <= r; i++ ) {
                combination *= (n - 1 + i);
                combination /= i;
            }
            System.out.print("C(" + n +" , " + r + ") = " + combination);
        }


    }
}
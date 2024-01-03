import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;

        Scanner inp = new Scanner(System.in);
        System.out.print("Exponent The Number: ");
        n = inp.nextInt();
        System.out.print("Number To Be Exponent: ");
        k = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Answer: " + total);
    }
}
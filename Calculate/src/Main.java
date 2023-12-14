import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The 1st Number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter The 2st Number: ");
        int number2 = scan.nextInt();

        System.out.println("WHICH CALCULATION");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");

        System.out.print("Enter Your Selection: ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("RESULT OF ADDITION = " + (number1 + number2));
                break;
            case 2:
                System.out.println("RESULT OF SUBTRACTION = " + (number1 - number2));
                break;
            case 3:
                System.out.println("RESULT OF MULTIPLICATION = " + (number1 * number2));
                break;
            case 4:
                System.out.println("RESULT OF DIVISION = " + (float) number1 / number2);
        }
    }
}
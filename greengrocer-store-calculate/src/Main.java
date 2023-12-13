import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Pear = 2.14, Apple = 3.67, Tomato = 1.11, Banana = 0.95, Eggplant = 5;

        System.out.print("Enter kg of Pear: ");
        double PearKg = input.nextDouble();

        System.out.print("Enter kg of Apple: ");
        double AppleKg = input.nextDouble();

        System.out.print("Enter kg of Tomato: ");
        double TomatoKg = input.nextDouble();

        System.out.print("Enter kg of Banana:: ");
        double BananaKg = input.nextDouble();

        System.out.print("Enter kg of Eggplant: ");
        double EggplantKg = input.nextDouble();

        double total = (Pear * PearKg) + (Apple * AppleKg) + (Tomato * TomatoKg) + (Banana * BananaKg) + (Eggplant *EggplantKg);
        System.out.print("Total Amount: " + total + " TL");

    }
}

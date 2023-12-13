import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, indeks=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Height: ");
        boy = input.nextDouble();

        System.out.print("Enter Wight: ");
        kilo = input.nextDouble();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-");

        indeks = kilo / (boy * boy);
        System.out.println("Body Mass Calculation: " + indeks);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-");
        
        if (indeks < 18.5) {
            System.out.println("Weak ");
        } else if (indeks >= 18.5 && indeks <= 24.9 ) {
            System.out.println("Normal ");
        } else if (indeks >= 25 && indeks <= 29.9 ) {
            System.out.println("Fat ");
        } else if (indeks >= 30 && indeks <= 34.9 ) {
            System.out.println("1st degree obese ");
        } else if (indeks >= 35 && indeks <= 39.9 ) {
            System.out.println("2st degree obese ");
        } else if (indeks > 40) {
            System.out.println("3st degree obese ");
        }

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-");

    }
}

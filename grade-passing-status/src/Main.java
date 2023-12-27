import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physical, turkish, chemical, music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Your Math Grade: ");
        math = inp.nextInt();

        System.out.print("Enter Your Physical Grade: ");
        physical = inp.nextInt();

        System.out.print("Enter Your Turkish Grade: ");
        turkish = inp.nextInt();

        System.out.print("Enter Your Chemical Grade: ");
        chemical = inp.nextInt();

        System.out.print("Enter Your Music Grade: ");
        music = inp.nextInt();

        double avarage = (math + physical + turkish + chemical + music) / 5;

        if (avarage <= 55) {
            System.out.print("You Failed The Class");
        } else if (avarage >= 100) {
            System.out.print("The Course Grades Entered Are Not Between 0 and 100, So They Could Not Be Calculated");
        } else {
            System.out.print("You Passed The Class");
        }

    }
}
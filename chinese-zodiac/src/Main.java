import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        What is the Chinese Zodiac?
        Chinese astrology is a type of astrology that has been used for 4000 thousand years and identifies people
        with 12 different zodiac signs and symbols. The Chinese Zodiac is an animal ring in which these 12 signs
        are arranged at equal intervals (10 degrees wide) and has little to do with stars.
        */

        int bYear, remainder = 12;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your Birth Year: ");
        bYear = inp.nextInt();

        bYear %= remainder;

        switch (bYear) {
            case 0:
                System.out.println("Chinese Zodiac Sign: Monkey");
                break;
            case 1:
                System.out.println("Chinese Zodiac Sign : Cockerel");
                break;
            case 2:
                System.out.println("Chinese Zodiac Sign : Dog");
                break;
            case 3:
                System.out.println("Chinese Zodiac Sign : Pig");
                break;
            case 4:
                System.out.println("Chinese Zodiac Sign : Hamster");
                break;
            case 5:
                System.out.println("Chinese Zodiac Sign : Taurus");
                break;
            case 6:
                System.out.println("Chinese Zodiac Sign : Tiger");
                break;
            case 7:
                System.out.println("Chinese Zodiac Sign : Rabbit");
                break;
            case 8:
                System.out.println("Chinese Zodiac Sign : Dragon");
                break;
            case 9:
                System.out.println("Chinese Zodiac Sign : Snake");
                break;
            case 10:
                System.out.println("Chinese Zodiac Sign : Horse");
                break;
            case 11:
                System.out.println("Chinese Zodiac Sign : Sheep");
                break;
        }

    }
}
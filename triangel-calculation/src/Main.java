import  java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int a, b;
        double c, u, alan;

        Scanner entry = new Scanner(System.in);

        System.out.print("1. Enter The Edge Value: ");
        a = entry.nextInt();
        System.out.print("2. Enter The Edge Value: ");
        b = entry.nextInt();
        System.out.print("3. Enter The Edge Value: ");
        u = entry.nextDouble();

        c = (a + b + u) / 2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Alan: " + alan);

        /*

        //HIPOTENUS
        c = Math.sqrt((a*a) +(b*b));
        System.out.println("Hipotenus: " + c);

        */
    }
}























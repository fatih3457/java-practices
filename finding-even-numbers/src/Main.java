import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number: ");
        k = inp.nextInt();

        for (int i = 0; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i +" ");
            }
        }

    }
}
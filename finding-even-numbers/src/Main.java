
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, k = 0, total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number: ");
        number = inp.nextInt();

        for (int i = 0; i<=number; i++) {
            if (i % 3 == 0 || i % 4 == 0){
                total = total + i;
                k++;
            }
        }

        if (k > 0) {
            double avarage = total / k;
            System.out.println("0'dan " + number + "kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + avarage);
        } else {
            System.out.println("Bu aralıkta 3 ve 4'e tam bölünen herhangi bir sayı bulunamadı.");
        }
    }
}

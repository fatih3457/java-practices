package kodbloklari.com;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();

        int enbuyuk = sayi1;

        if(sayi2 > enbuyuk) {
            enbuyuk = sayi2;
        }
        if(sayi3 > enbuyuk) {
            enbuyuk = sayi3;
        }

        System.out.println("Girilen sayılardan en büyüğü = " + enbuyuk);
    }
}
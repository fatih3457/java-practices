
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, tarih, muzik, din;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notu Giriniz: ");
        muzik = inp.nextInt();

        System.out.print("Din Notu Giriniz: ");
        din = inp.nextInt();

        int toplam = (mat + fizik + tarih + muzik + din);
        double sonuc = toplam / 5;

        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc > 60 ? "Geçti" : "Kaldı");

    }
}






















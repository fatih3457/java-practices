import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Km birim fiyatı : 0.10$
        // 12 yaşından küçükse toplam fiyata %50 indirim
        // 12 ve 24 yaş arasındaysa %10 indirim
        // 65 yaşından büyükse %30 indirim
        // Gidiş-Dönüş alırsa %20 indirim
        // Bu koşullara göre uçak bileti fiyatı hesaplayan program

        Scanner scan = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi Giriniz: ");
        km = scan.nextInt();
        System.out.print("\nYaşınızı Giriniz: ");
        yas = scan.nextInt();
        System.out.print("\nYolculuk Tipini Seçiniz: (1-Tek Gidiş , 2-Gidiş/Dönüş) ");
        tip = scan.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;

        if(km > 0 && yas > 0 && (tip==1 || tip==2)) { //Girilen Değerlerin Doğruluğu
            normalFiyat = km * 0.10;
            if(yas < 12) {
                yasIndirimi = normalFiyat * 0.5; //İndirim Oranını Hesaplar
            }else if(yas >= 12 && yas <=24) {
                yasIndirimi = normalFiyat * 0.10;
            }else if(yas >= 65) {
                yasIndirimi = normalFiyat * 0.30;
            }else {
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi; //Fiyattan İndirim Oranını Çıkarıyorum
            if(tip == 2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet Tutarı : " + normalFiyat + "$");
        }else {
            System.out.println("Girdiğiniz Değerler Eksik veya Yanlış ! Tekrar Deneyiniz !");
        }
    }

}
import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Month: ");
        month = inp.nextInt();
        System.out.print("Enter Day: ");
        day = inp.nextInt();

        if (month == 1 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                horoscope = ("Capricorn");
            }
            else {
                horoscope = ("Aquarius");
            }
        }

        else if (month == 2 && (day>=1 && day<=29)){
            if (day>=1 && day<=19){
                horoscope = ("Aquarius");
            }
            else {
                horoscope = ("Pisces");
            }
        }

        else if (month == 3 && (day>=1 && day<=31)){
            if (day>=1 && day<=20){
                horoscope = ("Pisces");
            }
            else {
                horoscope = ("Aries");
            }
        }

        else if (month == 4 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
                horoscope = ("Aries");
            }
            else {
                horoscope = ("Taurus");
            }
        }

        else if (month == 5 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                horoscope = ("Taurus");
            }
            else{
                horoscope = ("Gemini");
            }
        }

        else if (month == 6 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
                horoscope = ("Gemini");
            }
            else {
                horoscope = ("Cancer");
            }
        }

        else if (month == 7 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                horoscope = ("Cancer");
            }
            else{
                horoscope = ("Leo");
            }
        }

        else if (month == 8 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                horoscope = ("Leo");
            }
            else{
                horoscope = ("Virgo");
            }
        }

        else if (month == 9 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
                horoscope = ("Virgo");
            }
            else {
                horoscope = ("Libra");
            }
        }

        else if (month == 10 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                horoscope = ("Libra");
            }
            else{
                horoscope = ("Scorpio");
            }
        }

        else if (month == 11 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
                horoscope = ("Scorpio");
            }
            else {
                horoscope = ("Sagittarius");
            }
        }

        else if (month == 12 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                horoscope = ("Sagittarius");
            }
            else{
                horoscope= ("Capricorn");
            }
        }


        else {
            isError = true;
            System.out.println("Please Enter Correct Date");
        }

        if (isError == false)
            System.out.println("Horoscope: " + horoscope);
    }
}
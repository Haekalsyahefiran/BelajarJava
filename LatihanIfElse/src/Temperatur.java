import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        int suhu;

        System.out.println("Masukkan suhu");

        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();

          if (suhu < 20) {
            System.out.println("Suhu " + suhu + "Celcius, Dingin");
        } else if (suhu == 32 || suhu <= 100 )  {
            System.out.println("Suhu " + suhu + "Celcius, Panas");
        } else if (suhu == 31) {
            System.out.println("Suhu" + suhu + "Celcius, Hangat");
        } else {
            System.out.println("Suhu " + suhu + "Celcius, terlalu tinggi");
        }

    }
}
/**
 * buat else if
 * suhu 40 Panas*/
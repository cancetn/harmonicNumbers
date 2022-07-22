import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        //Harmonik Seri Formulu = 1 + (1/2) + (1/3) + (1/4) + (1/n)..

        int n;
        double toplam=0.0;

        Scanner inp = new Scanner(System.in);

        System.out.println("N sayisini giriniz = ");

        n = inp.nextInt();

        for(double i=1; i<=n; i++){

            toplam = toplam + (1.0 / i);

        }

        System.out.println("Toplam sonuc = "+toplam);


    }
}

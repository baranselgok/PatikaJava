import javax.imageio.ImageTranscoder;
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        float ortalama;

        System.out.print("Fizik Notu: ");
        Fizik = input.nextInt();

        System.out.print("Türkçe Notu: ");
        Turkce = input.nextInt();

        System.out.print("Kimya Notu: ");
        Kimya = input.nextInt();

        System.out.print("Matematik Notu: ");
        Matematik = input.nextInt();

        System.out.print("Muzik Notu: ");
        Muzik = input.nextInt();

        if ((Matematik>=0 &&Matematik<=100 )&& (Turkce >=0 &&Turkce<=100 ) && (Fizik>=0 &&Fizik <=100 )&& (Kimya>=0 &&Kimya<=100 )&& (Muzik>=0 &&Muzik<=100 )) {

            ortalama = (Matematik + Fizik + Kimya + Turkce + Muzik) / 5f;
            System.out.print("ortalamanız : " + ortalama);

            if (ortalama>= 55){
                System.out.println("Gectiniz.");}
            else System.out.println("kaldiniz.");

        }
        else System.out.println("hatali not girişi yapıldı.");


    }
}

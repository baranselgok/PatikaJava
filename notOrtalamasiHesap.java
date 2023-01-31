import java.util.Scanner;
public class NotOrtalamasiHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik, kimya,turkce, tarih, muzik;

        System.out.print("mat notu: ");
        mat = input.nextInt();

        System.out.print("fizik notu: ");
        fizik = input.nextInt();

        System.out.print("kimya notu: ");
        kimya = input.nextInt();

        System.out.print("turkce notu: ");
        turkce = input.nextInt();

        System.out.print("tarih notu: ");
        tarih = input.nextInt();

        System.out.print("muzik notu: ");
        muzik = input.nextInt();

        double ortalama= (mat+turkce+fizik+kimya+tarih+muzik)/6.0;

        String gecmeDurumu = (ortalama>=60) ? "gecti" : "kaldi.";
        System.out.println(gecmeDurumu);
    }

}

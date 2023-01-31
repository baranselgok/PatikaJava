import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {
        double normalFiyat, kdvliFiyat, kdvOrani ;
        Scanner input = new Scanner(System.in);

        System.out.print("Normal fiyatı girin : ");
        normalFiyat = input.nextDouble();

        kdvOrani = (normalFiyat<=1000) ? 0.18 : 0.8;

        kdvliFiyat = normalFiyat + normalFiyat*kdvOrani;

        System.out.println("KDVli fiyat : " + kdvliFiyat);

    }
}

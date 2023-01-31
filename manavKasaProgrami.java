import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.00f, toplamTutar, a, e, d, m, p;

        System.out.print("Armut kaç kilo ? ");
        a = input.nextFloat();

        System.out.print("Elma kaç kilo ? ");
        e = input.nextFloat();

        System.out.print("Domates kaç kilo ? ");
        d = input.nextFloat();

        System.out.print("Muz kaç kilo ? ");
        m = input.nextFloat();

        System.out.print("Patlıcan kaç kilo ? ");
        p = input.nextFloat();

        toplamTutar = a*armut + e*elma+ d*domates + m*muz + p* patlican;
        System.out.print("Toplam Tutar : " + toplamTutar);

    }
}

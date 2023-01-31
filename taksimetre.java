import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double mesafe, tutar, toplamMasraf;
        System.out.print("Gidilen mesafeyi yazın : ");
        mesafe = inp.nextDouble();

        tutar = mesafe* 2.2 +10;

        toplamMasraf = (tutar >=20)? tutar : 20;
        System.out.print("Toplam Masraf : " + toplamMasraf);
    }
}

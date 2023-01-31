import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double boy, kg, kitleIndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz: ");
        kg = inp.nextDouble();

        kitleIndeksi = kg / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : "+kitleIndeksi);
    }
}

import java.util.Scanner;
public class DaireninAlaniveCevresi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float alan, yaricap, cevre, pi = 3.14f , a, dilimAlani;

        System.out.print("Yaricap giriniz : ");
        yaricap = input.nextFloat();

        alan = pi * yaricap* yaricap;
        cevre = 2* pi* yaricap;

        System.out.println("cevre :" + cevre);
        System.out.println("alan : "+ alan);

        //merkez açısının ölçüsü a olan daire diliminin alanı
        System.out.print("merkez acisinin ölcüsünü giriniz : ");
        a = input.nextFloat();
        dilimAlani = (pi* (yaricap*yaricap)* a)/360;
        System.out.print("merkez açısının ölçüsü a olan daire diliminin alanı: " + dilimAlani);
    }
}

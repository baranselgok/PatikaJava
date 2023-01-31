import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int kenar1, kenar2, kenar3;
        double hipotenus, alan, cevre;

        System.out.print("İlk Kenarı Girin : ");
        kenar1 = inp.nextInt();
        System.out.print("ikinci Kenarı Girin : ");
        kenar2 = inp.nextInt();
        System.out.print("Üçüncü Kenarı Girin : ");
        kenar3 = inp.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1)+ (kenar2*kenar2));
        System.out.println("hipotenus : " + hipotenus);

        cevre =kenar2+kenar1+kenar3;
        alan = Math. sqrt((cevre/2)*(cevre/2 - kenar1)* (cevre/2 - kenar2) * (cevre/2 - kenar3));
        System.out.println("alan : " + alan);
    }
}

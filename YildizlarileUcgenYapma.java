import java.util.Scanner;

public class YildizlarileUcgenYapma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= n ; i++) {
            for (int k = 1; k <= ( i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*(n- i ); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total = total + i;
            }
        }
        if (total==n) {
            System.out.println(n + " Mükemmel sayıdır");
        }else {
            System.out.println(n + " Mükemmel sayı değildir");
        }

    }
}

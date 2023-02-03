import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, us, sonuc=1;
        System.out.println("Ussu alinacak sayi : ");
        sayi = input.nextInt();
        System.out.println("Us olacak sayi : ");
        us = input.nextInt();

        for (int i=1; i<=us; i++){
            sonuc *=us;
        }
        System.out.println("sonuc: " +sonuc);
    }
}

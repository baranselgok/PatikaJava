import java.util.Scanner;
public class SayiKarsilastirma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int miktar, min = 2147483647, max = -2147483647, sayi;
        System.out.println("Kaç tane sayı gireceksiniz? ");
        miktar = inp.nextInt();

        for (int i = 1; i<= miktar; i++){
            System.out.println(i + ". sayiyi girin: ");
            sayi = inp.nextInt();

            if (sayi < min){
                min = sayi;
            }
            if (sayi>max){
                max = sayi;
            }


        }

        System.out.println("Büyük sayi  = "+ max);
        System.out.println("Küçük sayı = "+ min);
    }
}

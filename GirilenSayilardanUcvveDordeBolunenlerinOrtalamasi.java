import java.util.Scanner;
public class GirilenSayilardanUcvveDordeBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int girilenSayi, adet = 0, toplam = 0;
        float ortalama = 0.0F;

        System.out.println("Sayi girin : ");
        girilenSayi = inp.nextInt();

        for (int i=0; i<=girilenSayi; i++){
            if (i % 3 == 0 && i % 4 ==0){
                toplam += i;
                adet++;
            }

        }
        ortalama = toplam/adet;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : "+ ortalama);
    }

}

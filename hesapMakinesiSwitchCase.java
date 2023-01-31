import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float n1, n2;
        int islem;
        System.out.println("İlk sayi: ");
        n1 = inp.nextFloat();
        System.out.println("İkinci sayi: ");
        n2 = inp.nextFloat();
        System.out.print("İşlem Seçiniz : 1-Toplama, 2-Çıkarma, 3- Çarpma, 4-Bölme ");
        islem = inp.nextInt();

        switch (islem){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println( n1/n2);
                break;
            default:
                System.out.println("Yanlış işlem seçimi.");
        }
    }
}

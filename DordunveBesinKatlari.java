import java.util.Scanner;
public class DordunveBesinKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int girilenSayi, kuvvet = 0;

        System.out.print("Sayi Giriniz :");
        girilenSayi = inp.nextInt();

        for (int i = 1; i<= girilenSayi; i*=4){
            System.out.println("4 üzeri "+ kuvvet +" = "+ i );
            kuvvet++;
        }
        kuvvet = 0;
        for (int j = 1; j<= girilenSayi; j*=5){
            System.out.println("5 üzeri "+ kuvvet +" = "+ j );
            kuvvet++;
        }
    }
}

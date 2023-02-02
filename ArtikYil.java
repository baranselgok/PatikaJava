import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil%4 == 0){
            System.out.print(yil + " bir artik yildir!");
        }else System.out.print(yil + " bir artik yil degildir!");
    }
}

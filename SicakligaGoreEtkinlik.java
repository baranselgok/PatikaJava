import java.util.Scanner;
public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {

        //Sıcaklık değişkeninin tanımlanması.

        int sicaklik;

        //Sıcaklık değerinin girilmesi.

        Scanner input=new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik=input.nextInt();

        //Sıcaklık değerine göre etkinlik önerme işlemi.

        if(sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik <=25) {
            if(sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(sicaklik > 10 ) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}

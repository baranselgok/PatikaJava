import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("İlk sayıyı girin: ");
        int num1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int ebob = findGCD(num1, num2);
        int ekok = num1 * num2 / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

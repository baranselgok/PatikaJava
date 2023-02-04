import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayi girin: ");
        int num = inp.nextInt();
        int reversed = 0;
        int originalNum = num;

        while (num != 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    }
}

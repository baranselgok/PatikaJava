import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number= input.nextInt();
        int busnumber=0;
        int tempnumber=number;
        int basvalue;

        while(tempnumber !=0){
            tempnumber /=10;
            busnumber++;
        }

        tempnumber=number;
        int result=0;


        while(tempnumber !=0){

            basvalue=tempnumber % 10;
            for(int i=1; i<=busnumber; i++){
            }result +=basvalue;
            tempnumber/=10;
        }System.out.println(result);
    }}


import java.util.Scanner;
public class Kullanıcı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String username, password, answer, newPassword;

        System.out.print("Kullanıcı adını girin : ");
        username = inp.next();

        System.out.print("Şifre giriniz : ");
        password = inp.next();

        if (username.equals("kullanıcıAdi") && password.equals("sifre123")){
            System.out.print("Basariyla giris yaptiniz.");
        }
        else {
            System.out.println("Giris yapilamadi. Sifrenizi yenilemek ister misiniz?");
            answer = inp.next();
            if (answer.equals("Yes")){
                System.out.print("Yeni sifre giriniz : ");
                newPassword = inp.next();
                if (newPassword == password){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.print("şifre oluşturuldu.");
                }
            }
            else {
                System.out.print("Yeni sifre talep edilmedi.");
            }

    }

 }
}

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id, password, password2;
        int secim;

        System.out.println("Kullanıcı adınızı giriniz:");
        id = input.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password = input.nextLine();

        if (id.equals("patika.dev") && password.equals("java101")) {
            System.out.println("Giriş başarılı");
        } else if
              (id.equals("patika.dev") && !password.equals("java123"))
    {

            System.out.println("Sifreniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ? İstemiyorsanız -1 İstiyorsanız - 2 ");
            secim = input.nextInt();
        switch (secim){
            case 1:
                System.out.println("İşleminiz sonlandırıldı.");
                break;
            case 2:
                System.out.print("Yeni şifrenizi giriniz: ");
                password2 = input.next();
                if(password2.equals(password) || password2.equals("java123")){
                    System.out.println("Şifreniz oluşturulamadı tekrar deneyiniz.");
                }else{
                    System.out.println("Şifreniz başarıyla oluşturuldu.");
                }
                break;
        }
        }

        else{
                    System.out.println("Kullanıcı adı ve şifre hatalı");

        }


    }
}


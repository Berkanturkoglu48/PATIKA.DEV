import java.util.Scanner;

public class SwitchCaseAtmUygulamasi {
    public static void main(String[] args) {
        String password , userName;
        int attempt=3 , select=0 ;
        double balance=1500 ,temp = 0;
        boolean isTrue=true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Kullanıcı adınızı giriniz :");
            userName = input.nextLine();

            System.out.print("Parolanızı giriniz :");
            password = input.nextLine();

            if (userName.equals("patika.dev") && password.equals("java101")){

                System.out.println("Giriş Basarılı");
                while(isTrue){

                    System.out.println("Ne yapmak istiyorsunuz");
                    System.out.println("1- Para Çekme\n2- Para Yatırma\n3- Bakiye Sorma\n4- Çıkış Yap");
                    select=input.nextInt();

                    switch(select) {

                        case 1:
                            System.out.println("Bakiyeniz :" + balance + " " + "\nNe kadar çekmek istiyorsunuz?");
                            temp = input.nextDouble();
                            if (temp > balance ){
                                System.out.println("Bakiyenizde bulunan miktardan fazla çekim yapamassınız !");
                            }else {
                                balance -= temp;
                                System.out.println("Kalan bakiyeniz :" + balance );}
                            break;

                        case 2:
                            System.out.println("Bakiyeniz :" + balance + " " + "\nNe kadar yatırmak istiyorsunuz?");
                            temp = input.nextDouble();
                            balance += temp;
                            System.out.println("Yeni bakiyeniz :" + balance );
                            break;

                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor ... İyi günler :) ");
                            isTrue=false;

                            break;

                        default:
                            System.out.println("Hatalı tuşlama yaptınız");

                    }
                }
                break;
            }else {
                attempt--;
                if (attempt == 0 )
                {
                    System.out.println("3 hatalı tuşlama yaptınız sistemden atılıyorsunuz");
                    break;
                }
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz! Kalan hakkınız: " + attempt);
            }

        }
        while(attempt != 0);



    }
}

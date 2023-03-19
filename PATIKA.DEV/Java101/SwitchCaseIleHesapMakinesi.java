import java.util.Scanner;

public class SwitchCaseIleHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,secim;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayınızı giriniz :");
        n1 = input.nextInt();

        System.out.println("İkinci sayınızı giriniz :");
        n2 = input.nextInt();
        System.out.println("Ne yapmak istiyorsunuz");
        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        secim = input.nextInt();

        switch(secim) {

            case 1:
                sonuc = n1 + n2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 2:
                sonuc = n1 - n2;

                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 3:
                sonuc = n1 * n2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez");
                    break;
                }

                 else{
                     sonuc = n1 / n2;
                     System.out.println("İşlemin sonucu : " + sonuc);}

                break;

            default:
                System.out.println("Hatalı giriş yaptınız");
        }


    }
}

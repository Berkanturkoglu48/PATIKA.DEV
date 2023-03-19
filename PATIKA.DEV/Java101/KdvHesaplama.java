import java.util.Scanner;

public class KdvHesaplama {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("KDV miktarını hesaplamak istediğiniz değeri giriniz.");
        double fiyat = input.nextDouble();
        double kdvOrani = fiyat < 1000 ? 18 : 8 ;

        double kdvMiktari = (fiyat) *(kdvOrani/100) ;
        double kdvliFiyat = fiyat + kdvMiktari;

        System.out.println("Kdv'li fiyat :" + kdvliFiyat);
        System.out.println("Kdv miktarı : " + kdvMiktari);





    }


}

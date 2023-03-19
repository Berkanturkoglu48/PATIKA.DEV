import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main (String[] args){

        double boy , kilo,sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz(Kg) :");
        kilo = input.nextDouble();

        System.out.println("Boyunuzu giriniz (M) :");
        boy = input.nextDouble();
        sonuc = kilo/(boy*boy) ;

        System.out.println("Vücut Kitle İndeksiniz:" + sonuc);









    }
}

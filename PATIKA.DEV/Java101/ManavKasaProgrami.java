import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main (String[] args ) {
        double armut = 2.14 , elma =3.67 , domates = 1.11, patlican = 5.00 , muz = 0.95, sonuc = 0 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç Kilogram Patlıcan Aldınız ?");
        double a = input.nextDouble();
        sonuc = sonuc + (patlican * a );

        System.out.println("Kaç Kilogram Armut Aldınız ?");
        double b = input.nextDouble();
        sonuc = sonuc + (armut * b );

        System.out.println("Kaç Kilogram Elma Aldınız ?");
        double c = input.nextDouble();
        sonuc = sonuc + (elma * c );

        System.out.println("Kaç Kilogram Muz Aldınız ?");
        double d = input.nextDouble();
        sonuc = sonuc + (muz * d );

        System.out.println("Kaç Kilogram Domates Aldınız ?");
        double e = input.nextDouble();
        sonuc = sonuc + (domates * e );

        System.out.println("Toplam Tutar : " + sonuc);

    }
}

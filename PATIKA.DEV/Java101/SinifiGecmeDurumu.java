import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main (String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        double sum = 0 , average;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if ((mat < 0) || (mat > 100)) {
            System.out.println("Matematik dersi notunuzu hatalı girdiniz Matematik dersi notunuz ortalamaya eklenmeyecek");
        } else {
            sum += mat;
        }

        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if ((fizik < 0) || (fizik > 100)){
            System.out.println("Fizk dersi notunuzu hatalı girdiniz Matematik dersi notunuz ortalamaya eklenmeyecek");
        } else{
            sum+=fizik;
               }

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if ((turkce < 0) || (turkce > 100)){
            System.out.println("Türkçe dersi notunuzu hatalı girdiniz Matematik dersi notunuz ortalamaya eklenmeyecek");
        } else{
            sum+=turkce;
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if ((kimya < 0) || (kimya > 100)){
            System.out.println("Kimya dersi notunuzu hatalı girdiniz Matematik dersi notunuz ortalamaya eklenmeyecek");
        } else{
            sum+=kimya;
        }

        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if ((muzik < 0) || (muzik > 100)){
            System.out.println("Muzik dersi notunuzu hatalı girdiniz Matematik dersi notunuz ortalamaya eklenmeyecek");
        } else{
            sum+=muzik;
        }
        average = sum / 5;

        if (average > 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }else {
            System.out.println("Kaldınız(Uyarı alıp almadığınızı kontrol ediniz.)");
        }
        System.out.println("Ortalamanız"+ average);



    }
}

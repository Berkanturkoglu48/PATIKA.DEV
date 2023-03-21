import java.util.Scanner;

public class WhileDongusuEbobEkok {
    public static void main(String[] args) {
        int n1, n2, kucukSayi, buyukSayi;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("2. sayıyı giriniz :");
        n2 = input.nextInt();

        if (n1 < n2) {
            kucukSayi = n1;
            buyukSayi = n2;
        } else {
            kucukSayi = n2;
            buyukSayi = n1;
        }

        int ebob = 1, i = 1;
        while (i<=kucukSayi) {
            if ((kucukSayi % i == 0) && (buyukSayi % i == 0)) {
                ebob = i;
            }
            i++;
        }
        int ekok = 1, j = 1;
        while (j <= (kucukSayi * buyukSayi)) {
            if ((j%kucukSayi == 0) && (j%buyukSayi == 0)) {
                ekok = j;
                break;
            }
            j++;

        }
        System.out.println("Sayıların EBOBU : " + ebob);
        System.out.println("Sayıların EKOKU : " + ekok);
    }
}

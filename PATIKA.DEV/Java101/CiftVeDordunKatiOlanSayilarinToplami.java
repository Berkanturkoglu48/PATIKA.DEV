import java.util.Scanner;

public class CiftVeDordunKatiOlanSayilarinToplami {
    public static void main(String[] args) {
        int number = 0, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayınızı giriniz");
            number = input.nextInt();
            if (number % 4 == 0 ){
                total+=number;
            }

        }while (number % 2 == 0);

        System.out.println("Girdiğiniz sayıların toplamı : "+ total );



    }
}

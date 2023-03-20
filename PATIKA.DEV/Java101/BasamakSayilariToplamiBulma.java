import java.util.Scanner;

public class BasamakSayilariToplamiBulma {
    public static void main(String[] args) {
        int number,total=0,lastNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı giriniz :");
        number = input.nextInt();

        while(number != 0){

            lastNumber= number % 10;
            total +=lastNumber;
            number /= 10;

        }
        System.out.println("Girdiğiniz sayının basamak sayılarının toplamı :"+ total);




    }
}

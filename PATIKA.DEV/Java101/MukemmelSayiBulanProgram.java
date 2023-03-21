import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        int number,total=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol edilecek sayıyı giriniz :");
        number = input.nextInt();
        int i =1;
        while(i < number){
            if (number % i == 0){
                total+=i;
            }
            i++;
        }
        if (total == number){
            System.out.println(number+ " Mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " Mükemmel bir sayı değildir.");
        }



    }
}

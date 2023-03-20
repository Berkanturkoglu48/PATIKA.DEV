import java.util.Scanner;

public class ArmstrongSayisiBulma {
    public static void main(String[] args) {

        int number=0, numberCounter=0 , total = 0,tempNumber, lastNumber=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        tempNumber =number;
        while(tempNumber !=0){
            tempNumber /= 10;
            numberCounter+=1;
        }

        tempNumber = number;
        while(tempNumber !=0){
            int tempTotal = 1;
            lastNumber = tempNumber%10;
            for(int i = 1 ; i <= numberCounter ; i++) {
                tempTotal *=lastNumber;

            }
            total +=tempTotal;
            tempNumber /= 10;

        }

        if (total == number) {
            System.out.println("Sayınız Armstrong sayısıdır.");
        }else {
            System.out.println("Sayınız Armstrong sayısı değildir.");
        }






    }
}

import java.util.Scanner;

public class MinimumMaximumDegerBulma {
    public static void main(String[] args) {
        int limit,smallNumber,bigNumber,number;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz ?");
        limit= input.nextInt();

        System.out.println("1. sayıyı giriniz");
        number= input.nextInt();
        smallNumber=number;
        bigNumber=number;

        for (int i =1 ;i < limit ;i++ ){
            System.out.println(i+1 + ". sayıyı giriniz");
            number= input.nextInt();

            if(number < smallNumber){
                smallNumber=number;
            }else if (number > bigNumber){
                bigNumber=number;
            }

        }
        System.out.println("En büyük sayı : "+ bigNumber);
        System.out.println("En küçük sayı : " + smallNumber);

    }
}

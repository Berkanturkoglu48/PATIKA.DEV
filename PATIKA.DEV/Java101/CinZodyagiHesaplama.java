import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int birthyear;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz :");
        birthyear = input.nextInt();
        birthyear %= 12;

        switch (birthyear) {
            case 0 :
                System.out.println("Çin zodyağı değeriniz : MAYMUN ");
                break;

            case 1 :
                System.out.println("Çin zodyağı değeriniz : HOROZ ");
                break;

            case 2 :
                System.out.println("Çin zodyağı değeriniz : KÖPEK ");
                break;

            case 3 :
                System.out.println("Çin zodyağı burcunuz : DOMUZ ");
                break;

            case 4 :
                System.out.println("Çin zodyağı burcunuz : FARE ");
                break;

            case 5 :
                System.out.println("Çin zodyağı burcunuz : ÖKÜZ ");
                break;

            case 6 :
                System.out.println("Çin zodyağı burcunuz : KAPLAN ");
                break;

            case 7 :
                System.out.println("Çin zodyağı burcunuz : TAVŞAN ");
                break;

            case 8 :
                System.out.println("Çin zodyağı burcunuz : EJDERHA ");
                break;

            case 9 :
                System.out.println("Çin zodyağı burcunuz : YILAN ");
                break;

            case 10 :
                System.out.println("Çin zodyağı burcunuz : AT ");
                break;

            case 11 :
                System.out.println("Çin zodyağı burcunuz : KOYUN ");
                break;
                
            default:
                break;













        }

    }
}

import java.util.Scanner;

public class YariCapiVeMerkezAciOlcusuIleAlan {
    public static void main (String[] args){
        int yariCapi , merkezAciOlcusu;
        double pi = 3.14 , alan ;


        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçap ölçüsünü giriniz");
        yariCapi = input.nextInt();

        System.out.println("Merkez açı ölçüsünü giriniz");
        merkezAciOlcusu = input.nextInt();

        alan= (pi*(yariCapi*yariCapi)*merkezAciOlcusu)/360;


        System.out.println("Alanınız : " + alan);



    }
}

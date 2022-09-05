package Ödev4;

import java.util.Scanner;

public class C07_Ödev1_Soru4 {

    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar
        uzunlugu birbirine esit ise ekrana "Eskenar ucgen" yazdirin.
        diğer durumlarda ekrana "Eskenar ucgen değil" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarini yazin.");

        double kenar1   = scan.nextDouble();
        double kenar2   = scan.nextDouble();
        double kenar3   = scan.nextDouble();

        if (kenar1 == kenar2 && kenar3 == kenar1) {
            System.out.println("Kenarlari verilen ucgenimiz eskenar ucgendir.");
        } else
            System.out.println("Kenarlari verilen ucgenimiz eskenar ucgen degildir.");

    }
}

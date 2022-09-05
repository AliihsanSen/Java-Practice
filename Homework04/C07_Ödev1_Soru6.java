package Ödev4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_Ödev1_Soru6 {

    public static void main(String[] args) {

        /*
        Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
                sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
                isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
                sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci tam sayi degeri giriniz.");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tam sayi degeri giriniz.");
        int sayi2 = scanner.nextInt();

        if (sayi1>0 && sayi2>0) {
            System.out.println("Sayilarin Toplamı :" + (sayi1 + sayi2));
        } else if ((sayi1>0 && sayi2<0) || (sayi1<0 && sayi2>0)){
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsın.");
        } else if ((sayi1 == 0) || (sayi2 == 0)){
            System.out.println("\"sifir carpmaya gore yutan elemandir\"");
        } else {
            System.out.println("Sayilarin Çarpimi :" + (sayi1 * sayi2));
        }


    }
}

package Ödev3;

import java.util.Scanner;

public class C05_Ödev3 {
    public static void main(String[] args) {

        /*
        6- Soru: İnt bir sayiyi double bir sayiya bolun ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk olarak tam sayı değeri giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci olarak double sayi değeri giriniz");

        double sayi2 = scan.nextDouble();

        System.out.println(sayi1/sayi2);



    }
}

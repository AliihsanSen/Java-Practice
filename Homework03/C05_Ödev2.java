package Ödev3;

import java.util.Scanner;

public class C05_Ödev2 {
    public static void main(String[] args) {

        /*
        5-Soru: İnt 2 sayiyi birbirine boldurun ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk olarak tam sayı bir değer giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci olarak tam sayı bir değer giriniz");

        int sayi2 = scan.nextInt();

        System.out.println(sayi1/sayi2);


    }
}

package Ödev2;

import java.util.Scanner;

public class C08_Ödev1 {
    public static void main(String[] args) {

        /*
        Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,
        fark ve carpimlarini yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");

        int sayi2 = scan.nextInt();

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 * sayi2);


    }
}

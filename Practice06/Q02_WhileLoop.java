package Practice06;

import java.util.Scanner;

public class Q02_WhileLoop {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir adet sayi giriniz : ");
        int sayi = scan.nextInt();

        tekSayi(sayi);

    }

    public static void tekSayi(int sayi) {

        int sayac = 0;

        while (sayi > 0) {
            if (sayi % 2 == 1) {
                System.out.println(sayi + " ");
                sayac++;
            }
            sayi--;
        }
        System.out.println("Sayac : " + sayac);

    }
}

package Recap_day1;

import java.util.Scanner;

public class Q15_Modulus {

    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve
         * son iki basamagindaki rakamlari toplamini bulunuz
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen beş basamakli bir sayi giriniz :");
        int sayi = scan.nextInt();

        int ilkIki = sayi / 1000;
        int sonıki = sayi % 100; // 100' e bolumunden kalani verir

        int ilkIkıTop = (ilkIki / 10) + (ilkIki % 10);
        System.out.println("ilkIkıTop = " + ilkIkıTop);

        int sonIkiTop = (sonıki / 10) + (sonıki % 10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("Sayilarin toplami :" + (ilkIkıTop + sonIkiTop));


    }
}

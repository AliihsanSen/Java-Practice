package Recap_day1;

import java.util.Scanner;

public class Q08_Scanner01 {

    public static void main(String[] args) {

        /*
         kullanicidan 2 tam sayi alin
         bu tam sayilari toplayin ve sonucu yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanicidan 1 tam sayi alin :");

        double sayi1 = scanner.nextDouble();

        System.out.print("Kullanicidan 2. tam sayi alin :");
        double sayi2 = scanner.nextDouble();

        System.out.println("Alinan sayilarin toplamı :" + (sayi1 + sayi2));
        System.out.println("Alinan sayilar farki :" + (sayi1 - sayi2));




    }

}

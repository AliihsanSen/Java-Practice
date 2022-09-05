package Ödev5;

import java.util.Scanner;

public class C01_Soru1 {

    public static void main(String[] args) {

        /*
        Soru 1 -) Kullanicidan bir tamsayi isteyin ve sayinin tek
        veye cift oldugunu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir adet tamsayi degeri giriniz");

        int sayi = scan.nextInt();

        if (sayi %2 == 0) {
            System.out.println("Alinan sayimiz cifttir");
        }else {
            System.out.println("Alinan sayimiz tektir");
        }

    }
}

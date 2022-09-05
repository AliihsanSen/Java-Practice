package Practice01;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini girmesini isteyin
         ve hangisinin daha uzun oldugunu yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz :");
        String firstName = scan.nextLine().toLowerCase();

        System.out.print("Lütfen soy isminizi giriniz :");
        String lastName = scan.nextLine().toLowerCase();

        if (firstName.length() > lastName.length()) {
            System.out.println("İsminiz daha uzun karakter icermektedir.");
        } else if (firstName.length() == lastName.length()) {
            System.out.println("Isminiz soyisminiz ile esit uzunluktadır. ");
        } else {
            System.out.println("Soyisminiz daha uzun karakter icermektedir.");
        }


    }
}

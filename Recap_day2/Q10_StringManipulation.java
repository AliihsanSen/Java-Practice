package Recap_day2;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini ve soyisimi girmesini isteyin,
        sonrasinda konsola tam ismini buyuk harfler ile yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz : ");
        String firstName = scan.nextLine(),
                lastName = scan.nextLine(); // Multiple declarations yapildi.

        String fullName = firstName.concat(" "+ lastName).toUpperCase();
        System.out.print("fullName = " + fullName);


    }
}

package Recap_day2;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {

        /*
        Scanner kullanarak iki ayri deger giriniz ve
        bu iki kelimeyi String manipulation method kullanarak
        birlestiriniz.
        yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
        ilk harflerini atip birlestiriniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("String1 : ");
        String str1 = scan.nextLine();

        System.out.print("String2 : ");
        String str2 = scan.nextLine();

        System.out.println("Birinci birleştirme yöntemi : " + str1 + " " + str2);
        System.out.println("İkinci birleştirme yöntemi : " + str1.concat(" " + str2));

        String str1_0indextensonra = str1.substring(1);

        String str2_0indextensonra = str2.substring(1);

        System.out.println("Manipulationdan sonraki hali : " + str1_0indextensonra + " " + str2_0indextensonra);


    }
}

package Ödev1;

import java.util.Scanner;

public class C08_Ödev6 {
    public static void main(String[] args) {
         /*
        Soru 6) Kullanicidan ismini ve soyismini alip aralarinda
        bir bosluk olusturarak asagidaki sekilde yazdirin
        Isim – soyisim : Mehmet Bulutluoz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lütfen soyİsminizi giriniz");

        String soyİsim = scan.next();

        System.out.println("İsim - Soyisminiz :" + isim + " - " + soyİsim);
    }
}

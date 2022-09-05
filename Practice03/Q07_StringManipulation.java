package Practice03;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.nextLine();

        String tersKelime = kelime.substring(kelime.length() - 1);
        for (int i = kelime.length() - 2; i >= 0; i--) {
            tersKelime += kelime.substring(i, i + 1);
        }
        System.out.println("tersKelime = " + tersKelime);

        /* Bir baska cözüm yolu
        Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() <= 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");
        }         */

    }

}

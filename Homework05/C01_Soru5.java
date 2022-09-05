package Ödev5;

import java.util.Scanner;

public class C01_Soru5 {

    public static void main(String[] args) {
        /*
        soru 5-) Kullanicidan bir gun alin eger gun "Cuma" ise ekrana
        "Muslumanlar icin kutsal gun" yazdirin. "Cumartesi" ise ekrana
        "Yahudiler icin kutsal gun" yazdirin. "Pazar" ise ekrana
        "Hristiyanlar icin kutsal gun" yazdirin.
           */

        Scanner scanner = new Scanner(System.in);
        String girilenGun = scanner.nextLine().toLowerCase();

        if (girilenGun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }else if (girilenGun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        } else if (girilenGun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else{
            System.out.println("GirilenGun output'unu kontrol ediniz");
        }

    }
}

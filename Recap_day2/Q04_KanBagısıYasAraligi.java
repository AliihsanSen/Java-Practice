package Recap_day2;

import java.util.Scanner;

public class Q04_KanBagısıYasAraligi {

    public static void main(String[] args) {

        /*
         Problem tanimi :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk, 50 ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kilogram cinsinden kilonusu giriniz : ");
        int kilo = scan.nextInt();

        System.out.print("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        if (yas < 18) {
            System.out.println("18 yasindan kücük olanlar kan bagisi yapamaz.");
        } else if (yas >= 18) {
            if (kilo < 50) {
                System.out.println("50 kilodan hafif oldugunuz icin kan bagısı yapamazsınız.");
            } else if (kilo >= 50) {
                System.out.println("Kan bagısı yapmak isterseniz istedigininiz zaman yapabilirsiniz");
            }else {
                System.out.println("Girmis oldugunuz degeri kontrol ediniz.");
            }
        }

    }
}

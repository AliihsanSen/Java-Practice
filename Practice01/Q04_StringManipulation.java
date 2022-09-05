package Practice01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q04_StringManipulation {

    public static void main(String[] args) {

        /*
          Kullanicidan bir kelime girmesini isteyin.
        * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
        * kelimenin ortasindaki karakteri yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir kelime giriniz : ");
        String str = scan.nextLine().toLowerCase();

        boolean b = str.length() % 2 == 1 && str.length() >= 3;
        if (b) {
            System.out.println("Girilen karakter tek sayili oldugu icin : "
                    + str.substring(str.length() / 2, str.length() / 2 + 1));
        } else {
            System.out.println("Girmis oldugunuz kelime cift karakterlidir.");
        }

        /*
        Alternatif cözum yöntemleri
         */

        char ortancaKrk = str.charAt((str.length() - 1) / 2);

        if (b) {
            System.out.print("ortancaKrk = " + ortancaKrk);
        } else {
            System.out.println("Girmis oldugunuz kelime cift karakterlidir.");
        }

    }
}

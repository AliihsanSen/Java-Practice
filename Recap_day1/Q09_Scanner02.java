package Recap_day1;

import java.util.Scanner;

public class Q09_Scanner02 {

    public static void main(String[] args) {
        /*
         kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
         ve yasadiklari yeri seviyorlarsa
         bu bilgiyi yazdirin

         --> next() only can read the first word
         --> nextLine() can read the whole line
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("İsminizi giriniz :");
        String isim = scanner.nextLine();

        System.out.println("Memleketinizi giriniz :");
        String memleket = scanner.nextLine();

        System.out.println("Konumunuzu giriniz :");
        String konum = scanner.nextLine();

        System.out.println("Yasinizi giriniz :");
        int yas = scanner.nextInt();

        System.out.println("Boyunuzu giriniz :");
        double boy = scanner.nextDouble();

        System.out.println("Yasadiginiz " + konum + "u seviyor musunuz? true/false");

        boolean seviyorMu = scanner.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }
}

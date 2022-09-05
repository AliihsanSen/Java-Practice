package Ödev2;

import java.util.Scanner;

public class C08_Ödev4 {
    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        kisa kenarlarini ve yuksekligini isteyip
        prizmanin hacmini hesaplayip yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdörtgenler prizmasının kısa kenarını giriniz");

        int kısaKenar = scan.nextInt();

        System.out.println("Dikdörtgenler prizmasının uzun kenarını giriniz");

        int uzunKenar = scan.nextInt();

        System.out.println("Dikdörtgenler prizmasının yüksekligini giriniz");

        int yukseklik = scan.nextInt();

        System.out.println("Dikdörtgenler Prizmasının hacmi :" + kısaKenar * uzunKenar * yukseklik);

    }
}

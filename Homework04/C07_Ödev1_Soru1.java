package Ödev4;

import java.util.Scanner;

public class C07_Ödev1_Soru1 {

    public static void main(String[] args) {

        /*
        Soru 1)
            Kullanicidan dikdorgenin kenar uzunluklarini isteyin ve
            dikdortgenin kare olup olmadigini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");

        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();

        if (kenar1== kenar2) {
            System.out.println("Oluşan şeklimiz aynı zamanda karedir.");
            } else
            System.out.println("Oluşan şeklimiz yalniz dikdortgendir.");



    }
}

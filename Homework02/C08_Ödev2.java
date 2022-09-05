package Ödev2;

import java.util.Scanner;

public class C08_Ödev2 {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve
        karenin cevresini ve alanini  hesaplayip yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu giriniz");
        int a = scan.nextInt();
        System.out.println("Karenin çevresi : " + 4 * a);
        System.out.println("Karenin alani : " + a * a);



    }
}

package Ödev2;

import java.util.Scanner;

public class C08_ödev6 {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini alip isminin bas harfini yazdirin.
         */
         Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi yazin");

        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("İsminizin ilk Harfi :" + ilkHarf);



    }
}
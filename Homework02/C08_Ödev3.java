package Ödev2;

import java.util.Scanner;

public class C08_Ödev3 {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cemberin yarıçapini giriniz");
        int r = scan.nextInt();
        System.out.println("Cemberin cevresi :"+ 2 * r * 3.14);
        System.out.println("Cembrein Alanı :" + 3.14 * r * r);
    }
}

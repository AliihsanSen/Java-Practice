package Ödev5;

import java.util.Scanner;

public class C01_Soru2 {

    public static void main(String[] args) {

        /*
        Soru 2-) Kullanicidan gun isimlerinden birinin ilk harfini
        isteyin ve o harfle baslayan gun isimlerini yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen haftanin gunlerinden herhangi birinin ilk harfini yazdirin");
        char gun = scanner.next().toUpperCase().charAt(0);

        if (gun == 'P'){
            System.out.println("Pazartesi , Perşembe , Pazar");
        }else if (gun == 'S'){
            System.out.println("Sali");
        } else if (gun == 'Ç') {
            System.out.println("Çarşamba");
        }else if (gun == 'C'){
            System.out.println("Cuma , Cumartesi");
        }else{
            System.out.println("Inputta girilen ifade outputta bir karsiligi bulunmamaktadır");
        }
    }
}

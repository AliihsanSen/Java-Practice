package Ödev4;

import java.util.Scanner;

public class C07_Ödev1_Soru8 {

    public static void main(String[] args) {
    /*
    Soru 8 -) Kullanicidan maas icin bir teklif isteyin ve asagidaki
    degerlere gore cevap yazdirin.
    Teklif 80.000'in uzerinde ise "Kabul ediyorum"
    60.000 - 80.000 arasinda ise "Konusabiliriz"
    60.000'in altinda ise "Maalesef kabul edemem" yazdirin
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen maas degeri icin bir adet sayi giriniz");

        double maas = scan.nextDouble();

        if (maas>= 80.000) {
            System.out.println("Kabul ediyorum");
        }else if (maas>= 60.000 || maas <80.000){
            System.out.println("Konusabiliriz");
        }else{
            System.out.println("Maalesef kabul edemem");
        }
    }
}

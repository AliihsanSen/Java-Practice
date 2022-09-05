package Practice03;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Yapmak istediginiz islemin sembolunu giriniz :");
        String sembol = scan.nextLine();

        System.out.print("Birinci sayiyi giriniz : ");
        double sayi1 = scan.nextDouble();

        System.out.print("İkinci sayiyi giriniz : ");
        double sayi2 = scan.nextDouble();

        if (sembol.equals("/")) {
            System.out.println("Secmis oldugunuz sembol bolme isleminin sembolüdür : " + (sayi1 / sayi2));
        } else if (sembol.equals("*")) {
            System.out.println("Secmis oldugunuz sembol carpma isleminin sembolüdür :  " + (sayi1 * sayi2));
        } else if (sembol.equals("+")) {
            System.out.println("Secmis oldugunuz sembol toplama isleminin sembolüdür : " + (sayi1 + sayi2));
        } else if (sembol.equals("-")) {
            System.out.println("Secmis oldugunuz sembol cıkarma isleminin sembolüdür :" + (sayi1 - sayi2));
        } else {
            System.out.println("Girmis oldugunuz sembolleri kontrol ediniz.");
        }







    }
}

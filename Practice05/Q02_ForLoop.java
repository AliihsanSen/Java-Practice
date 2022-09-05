package Practice05;

import java.util.Scanner;

public class Q02_ForLoop {

     /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1'den buyuk bir rakam giriniz : ");
        int sayi1 = scan.nextInt();

        int toplam = 0;

        if (sayi1 >= 1) {
            for (int i = 1; i < sayi1; i++) {
                System.out.print(i * i + " ");
                toplam += i * i;
            }
            System.out.println(" ");
            System.out.println("Girilen n degeri " + sayi1 + "'tur, toplam = " + toplam);


        }

    }
}

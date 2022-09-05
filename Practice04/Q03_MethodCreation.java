package Practice04;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
  0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet Fibonacci sayisi gormek istiyorsunuz : ");
        int sayi3 = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        System.out.println(sayi3 + " Sayisinin Fibonacci sayilari : ");

        for (int i = 2; i <= sayi3; i++) {
            System.out.print(sayi1 +  "  ");
            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }

}

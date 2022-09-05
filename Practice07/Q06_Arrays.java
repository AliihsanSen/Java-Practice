package Practice07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {

        farkiniBul();
    }

    public static void farkiniBul() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array'in uzunlugunu giriniz : ");
        int uzunluk = scanner.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Array'in " + (i + 1) + ". elemanini giriniz : ");
            /*
            i --> oldugunda 0. eleman diyecek, biz index degil direkt eleman sorduk.
             */
            arr[i] = scanner.nextInt();
            /*
            fori'den gelen indexler, bu satirda kullanici
            tarafindan dongu bitene kadar girilen elemanlar okunur
             */
        }
        Arrays.sort(arr);
        System.out.print("Array'deki en buyuk eleman ile en kucuk eleman arasindaki fark : "
                + (arr[uzunluk - 1] - arr[0]));

        /*
        Bu soruyu matematik class'i kullanarak tekrar cozunuz.
         */

    }

}

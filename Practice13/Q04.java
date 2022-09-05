package Practice13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

        /*
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        0-1-1-2-3-5-8-13-21-34....
        */

    public static void main(String[] args) {

        List<Integer> fibonaccilist = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir adet sayi giriniz : ");
        int sayi = scanner.nextInt();
        fibonaccilist.add(0);
        fibonaccilist.add(1);
        System.out.println("fibonaccilist = " + fibonaccilist);

        int i = 1; // while sartini olusturmak icin kullandik
        if (sayi <= 1) {
            System.out.println("Daha buyuk sayilar giriniz.");
        } else {
            while (fibonaccilist.get(i) < sayi) {
                // fibonacci elamanlari sayidan kucuk oldugu sürece
                fibonaccilist.add(fibonaccilist.get(i) + fibonaccilist.get(i - 1));
                i++;
            }
            System.out.println("fibonaccilist = " + fibonaccilist);
        }

        int sonIndextekiEleman = fibonaccilist.size() - 1;

        if (fibonaccilist.get(sonIndextekiEleman) > sayi) {
            fibonaccilist.remove(sonIndextekiEleman); // burasi son elemani kaldiririr
            System.out.println("Girdiğin sayi fibonacci dizisinde bulunmamaktadir = " +
                    " sizin girdiginiz sayiya kadar ki fibonacci dizisi budur :" + fibonaccilist);
        } else {
            System.out.println("Senin girdiğin sayi fibonacci listinde var fibonaccilist : " + fibonaccilist);
        }

    }
}

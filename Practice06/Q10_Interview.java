package Practice06;

import java.util.Scanner;

public class Q10_Interview {

    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini
     * yine kulanicidan alinan sayi kadar return eden metod yaziniz

     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayaya
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir string giriniz : ");
        String input = scanner.nextLine();

        System.out.print("Lutfen bir adet sayi giriniz : ");
        int sayi = scanner.nextInt();

        ilkSonHarf(input, sayi);
        System.out.println("ilkSonHarf(input, sayi) = " + ilkSonHarf(input, sayi));


    }

    public static String ilkSonHarf(String str, int n) {
        /*
        input yerine str sayi yerine n kullanabiliriz, değismez.
         bu method ilkSonHarf e tanımlı, sadece isimleri farklı
         */

        String s = str.substring(0, 1) + str.substring(str.length() - 1);

        String sonuc = "";

        for (int i = 1; i <= n; i++) {
            sonuc += s;
        }


        return sonuc;
    }

}

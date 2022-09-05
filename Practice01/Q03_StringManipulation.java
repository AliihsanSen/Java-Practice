package Practice01;

import java.util.Scanner;

public class Q03_StringManipulation {

    public static void main(String[] args) {

        /*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise
        kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise
        "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir adet string bir ifade giriniz : ");
        String name1 = scan.nextLine().toLowerCase();

        System.out.print("Luutfen bir adet daha string ifade giriniz : ");
        String name2 = scan.nextLine().toLowerCase();

        if (name1.length() % 2 == 0) {
            System.out.print("Name1 degiskeninin karakter sayisi cift oldugu icin : "
                    + name1.substring(0, name1.length() / 2) + name2
                    + name1.substring(name1.length() / 2));
        } else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }

    }
}

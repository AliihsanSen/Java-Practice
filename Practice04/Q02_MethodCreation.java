package Practice04;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen cm cinsinden bir sayi yaziniz : ");
        double cm = scan.nextDouble();
        ceviri(cm);

    }

    public static void ceviri(double cm) {

        double metre = cm / 100;
        System.out.println(cm + " santimetre = " + metre + " metreye tekabül etmektedir.");

        double km = metre / 100;
        System.out.println(metre + " metre = " + km + " kilometreye tekabül etmektedir.");

    }
}

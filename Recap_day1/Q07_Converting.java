package Recap_day1;

import java.util.Scanner;

public class Q07_Converting {






    public static void main(String[] args) {

     /*
      Soru 1 -) galonu litreye ceviren bir java programi yaziniz
                1 gallon = 3.785 litre
                litreyi galona ceviren bir java programi yaziniz
                  1 litre = 1/3.785 gallon
      */

        int gallon = 1000;
        double litre = gallon * 3.785;
        String sonuc1 = gallon + " galon degeri " + litre + "Litreye eşittir";
        System.out.println("sonuc1 = " + sonuc1);
        // sonuc1 = 1000 galon degeri 3785.0Litreye eşittir

        int litre1 = 1000;
        double gallon1 = 1/3.785;
        System.out.println( litre1 + " Litre degeri " + litre + "Litreye eşittir");
        // 1000 Litre degeri 3785.0Litreye eşittir


        /*
        Soru 2 -) Sıcaklığı Fahrenhayt'tan Santigrat derecesine
        çeviren bir Java programı yazın.
         formül
             c = (f-32)*5/9
         */

            Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Fahrenhayt cinsinden bir hava sıcaklıgı degeri giriniz");
        // Lütfen Fahrenhayt cinsinden bir hava sıcaklıgı degeri giriniz

        int fahrenheit = scan.nextInt();

        System.out.print("Girdiginiz Fahrenhayt degeri : " + (fahrenheit-32)*5/9);
        // Girdiginiz Fahrenhayt degeri : .....



    }



}

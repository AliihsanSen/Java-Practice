package Java_Practice.Practice16;

import java.util.Scanner;

public class Solution {

    /*
    Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
    biri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
    arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız

    Örnek  :

    input  : hour : 12,  minutes : 30
    Output : 165
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Saatin Akrep ve Yelkovan arasindaki farkini bulmak için saat ve dakikayi ayrı ayrı giriniz!");

        System.out.print("Lutfen Saati Giriniz : ");
        int hour = scan.nextInt();

        System.out.print("Lutfen Dakikayi Giriniz : ");
        int minutes = scan.nextInt();

        System.out.println("Akrep ile Yelkovan arasindaki aci farki : " + angleClock(hour, minutes));

    }

    public static double angleClock(int hour, int minutes) {

        double ek = (double) minutes / 12;
        double hourAngle = ((hour % 12) * 30) + (ek * 6);
        double newMinute = (double) minutes / 5;
        double minuteAngle = newMinute * 30;
        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            return (360 - angle);
        } else {
            return angle;
        }

    }
}

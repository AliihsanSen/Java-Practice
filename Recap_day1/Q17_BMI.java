package Recap_day1;

import java.util.Scanner;

public class Q17_BMI {

    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)

		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen vucut agırlıgınızı yaziniz :");
        double agırlık = scan.nextDouble();

        System.out.print("Lutfen boyunuzu cm olarak yaziniz :");
        double boy = scan.nextDouble();

        double boy1 = boy / 100; // boy/=100; , boy = boy/100;

        double endeks = agırlık / (boy1 * boy1);

        System.out.println("endeks = " + endeks);

    }

}

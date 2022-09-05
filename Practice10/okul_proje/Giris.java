package Practice10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz okulumuz ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim giriniz : ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyisim = scanner.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();

        System.out.print("Bransınızı giriniz : ");
        String brans = scanner.next();

        scanner.nextLine(); // dummy hayalet komut.

        System.out.print("Telefon no giriniz : ");
        String tel = scanner.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<OgretmenBilgileri>();
        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);


    }

}

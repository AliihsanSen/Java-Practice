package Practice12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciList = new ArrayList<>();
    static List<Kisi> ogrtmnList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    /*
    Static yazmamizin sebebi tum method'dan ulasmak icin
    (gokteki ay gibi heryeden ulaşılabilsin)
     */

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();
        // kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol o şekilde yapılacak

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("Hatali Giris :( ");
                girisPaneli();
                break;
        }
    }

    private static void islemMenusu() {

        System.out.println("Sectigin kisi turu " + kisiTuru + " lutfem asagidaki islemleri seciniz");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("İslem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle(); // yapıldı
                islemMenusu(); // method call ile islemMenusu() tekrar gider.
                break;
            case 2:
                arama(); // yapildi
                islemMenusu();
                break;
            case 3:
                listeleme(); // yapildi
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli(); // yani ana menu
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("guzel bir sey giriniz : ");
                islemMenusu();
                break;


        }

    }

    private static void cikis() {
        System.out.println("Yine bekleriz okulumuza hos cakalin");
    }

    private static void silme() { // silme islemi de tc ile yapılacak
        System.out.println("**** " + kisiTuru + " silme sayfasina hos geldiniz : ");
        boolean flag = true; // bayrak havada aksiyon basla
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("Silmek istedigin kimlik no gir ");
            String silinecekKimlikNo = scan.next().replaceAll(" ", "");
            for (Kisi each : ogrenciList) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Silinecek ogrenci " + each.getAdSoyad());
                    ogrenciList.remove(each); // o ogrenciyi siler
                    flag = false;
                    break;
                }
            }
            if (flag) { // eger girilen tc list'te yok ise bu if body'si calisir
                System.out.println("Bu tc ile ogrenci yok silinemedi.");
            }

        } else { // ogretmen islemleri icin kontrol
            System.out.println("Silinecek ogretmenin Kimlik no giriniz");
            String silinecekKimlikNo = scan.next().replaceAll(" ", "");
            for (Kisi each : ogrtmnList) {
                if (each.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                    System.out.println("Silinecek ogretmen " + each.getAdSoyad());
                    ogrtmnList.remove(each);
                    flag = false;
                    break;
                }

            }
            if (flag) { // kullanicinin girdigi tc kimlik no hicbir ogretmen ile eslesmedi.
                System.out.println("Bu tc ile ogretmen bulunamadi ve silinemedi.");
            }

        }

    }

    private static void listeleme() {
        System.out.println("**** " + kisiTuru + " arama sayfasina hos geldiniz : ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("ogrenciList = " + ogrenciList);
        } else {
            for (Kisi each : ogrtmnList) {
                System.out.println("each.toString() = " + each.toString());
            }
        }

    }

    private static void arama() {
        System.out.println("**** " + kisiTuru + " arama sayafasina hos geldiniz : ");
        boolean flag = true; // bayrak yukarda true olan her sart devam eder.

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // Bu satirda ogrenci arıyorsa calisir.
            // dummy
            System.out.println("Kimlik no giriniz : ");
            String arananKimlikNo = scan.next().replaceAll(" ", "");// Kullanici bosluk girerse diye bosluk hiclik yapildi.
            for (Kisi w : ogrenciList) {
                if (w.getKimlikNo().equals(arananKimlikNo)) { // Kullanicinin girdigi tc ile ogrenci listesinde ki tc'lerden eslesen var mi
                    System.out.println("Aradiginiz ogrenci " + w.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) { // flag true ise hala bu if body'si calisir.Yani aranan tc ile ogrenci yok demektir.
                System.out.println("Aranan tc ile ogrenci yok");
            } // 101'den 113'e kadar ogrenci islemleri.
        } else {
            System.out.println("**** " + kisiTuru + " arama sayafasina hos geldiniz : ");
            System.out.println("Kimlik no giriniz : ");
            String arananKimlikNo = scan.next().replaceAll(" ", "");// Kullanici bosluk girerse diye bosluk hiclik yapildi.

            for (Kisi w : ogrtmnList) {
                if (w.getKimlikNo().equals(arananKimlikNo)) { // Kullanicinin girdigi tc ile ogrenci listesinde ki tc'lerden eslesen var mi
                    System.out.println("Aradiginiz ogretmen " + w.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) { // flag true ise hala bu if body'si calisir.Yani aranan tc ile ogrenci yok demektir.
                System.out.println("Aranan tc ile ogretmen yok");
            } // else body'si ogretmen olarak tasarlandi.

        }


    }

    private static void ekle() { // Bu method hem ogrenci hemde ogretmen eklemek icin tasarlandi.

        System.out.println("**** " + kisiTuru + " ekleme sayafasina hos geldiniz : ");
        System.out.println("İsim soyisim gir : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();

        System.out.println("kimlik gir : ");
        String kimlikNo = scan.nextLine();

        System.out.println("Yas giriniz : ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("Ogrenci no gir : ");
            String ogrenciNo = scan.next().replaceAll(" ", "");

            System.out.println("sinif gir : ");
            String sinif = scan.next().replaceAll(" ", "");

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif); // parameter siralamasi onemli
            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);

        } else {
            scan.nextLine();// dummy kod hata almamak icin
            System.out.println("Bolum giriniz : ");

            String bolum = scan.nextLine();


            System.out.println("Sicil nosu giriniz : ");
            String sicilNo = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }
    }
}

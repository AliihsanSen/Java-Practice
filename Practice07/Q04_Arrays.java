package Practice07;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        // 1
        str = str.replace(" ", "");
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());

        // 2
        String[] harf = str.split("");
        System.out.println("harf.length = " + harf.length);

        // 3
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[] kelime = str1.split(" ");
        int boslukSayisi = kelime.length - 1;
        System.out.println("boslukSayisi = " + boslukSayisi);

        // 4
        String[] character = str1.split("");
        System.out.println("Character sayisi = " + (character.length - boslukSayisi));


    }
}

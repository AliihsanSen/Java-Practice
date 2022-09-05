package Practice04;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

        System.out.println("For ile cozumu asagıdaki gibidir : ");

        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;
            System.out.println(i + " --> " + karakter);
        }


        System.out.println("While ile cozumu asagıdaki gibidir : ");

        int i = 0;
        while (i <= 255) {
            char karakter1 = (char) i;
            System.out.println(i + " --> " + karakter1);
            i++;
        }


        System.out.println("Do while ile cozumu asagidaki gibidir : ");

        int a = 0;
        do {
            char karakter2 = (char) a;
            System.out.println(a + " --> " + karakter2);
            a++;
        } while (a <= 255);

    }
}

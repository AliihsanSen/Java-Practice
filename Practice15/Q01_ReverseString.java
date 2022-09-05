package Practice15;

public class Q01_ReverseString {

    public static void main(String[] args) {

        String name = "Java Dünyası cok guzel"; // O(n) --> O(n/2)

        System.out.println(reverse01(name)); // lezug koc ısaynüD avaJ
        System.out.println(reverse02(name)); // lezug koc ısaynüD avaJ

    }

    public static String reverse01(String name) {

        String str2 = "";
        String[] str = name.split("");

        for (int i = str.length - 1; i >= 0; i--) {
            str2 = str2 + str[i];
        }

        return str2;
    }

    public static String reverse02(String name) {

        String str2 = "";
        String temp = "";
        String[] str = name.split("");

        for (int i = 0; i < str.length; i++) {
            String start = str[i];
            String end = str[str.length - (i + 1)];
            temp = start;
            start = end;
            end = temp;
            str2 = str2 + start;

        }
        return str2;
    }


}

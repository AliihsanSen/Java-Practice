package Practice09.restaurant;

public class müşteri {

    public static void main(String[] args) {

        mutfak menu = new mutfak();


        System.out.println("menu.toString() = " + menu.toString());

        mutfak siparisim = new mutfak("adanakebab", "yaylacorba","kunefe","kola");
        System.out.println("siparisim = " + siparisim);

    }
}

package Practice09.restaurant;

public class mutfak {

    public String yemekler = "adanakebab, urfaciger, kusbasi, kusleme";
    public String araSicak = "yaylacorba, mercimek, duuncorba, corba";
    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, salgam, kola";

    public mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
       this.yemekler =yemekler;
       this.araSicak =araSicak;
       this.tatlilar =tatlilar;
       this.icecekler =icecekler;
    }

    public mutfak() {

    }

    @Override
    public String toString() {
        return
                "\nyemekler = " + yemekler +
                "\naraSicak = " + araSicak +
                "\ntatlilar = " + tatlilar +
                "\nicecekler = " + icecekler ;
    }
}

package Practice10.okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri(String isim, String soyisim,
                             int yas, String brans,
                             String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return
                "isim = " + isim +
                ", soyisim = " + soyisim +
                ", yas = " + yas +
                ", brans = " + brans +
                ", tel = " + tel;
    }

    public OgretmenBilgileri() {
    }
}

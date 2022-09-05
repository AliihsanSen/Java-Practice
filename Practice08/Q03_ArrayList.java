package Practice08;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {

        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 47, 102};
        int n = 4;

        // bir list olusturalim
        List<Integer> list = new ArrayList<Integer>();

        // listeye elemanlari ekleyelim

        for (int each : arr) {
            list.add(each);
        }

        List<Integer> maxList = new ArrayList<Integer>();
        int sayac = 1;

        while (sayac <= n) {
            int max = list.get(0); // list'in ilk eleamani max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max && !(maxList.contains(list.get(i)))) { // listenin herhangi bir elemani max'dan buyukse
                    max = list.get(i); // max artik o eleman olsun
                }
            }
            maxList.add(max); // 102 eklendi
            list.remove(list.indexOf(max)); // max listeye ekledigim sayiyi artik listeden kaldiriyorum
            sayac++;
        }
        System.out.println("Array'in max " + n + " elemani " + maxList);


    }
}

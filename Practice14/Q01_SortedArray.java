package Practice14;

import java.util.Arrays;

public class Q01_SortedArray {

    /*
    Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp
    yine artan değerlerde ekrana yazdıran metod oluşturunuz

    Örnek :

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    */

    public static void main(String[] args) {

        int[] num = {-4, -1, 0, 3, 10};


        System.out.println("sortedArray(num) = " + Arrays.toString(sortedArray(num)));
        // sortedArray(num) = [0, 1, 9, 16, 100]

        /*
        1. YOL
         */
        int[] istenen = Arrays.stream(num).map(t -> t * t).sorted().toArray();
        System.out.println(Arrays.toString(istenen)); // [0, 1, 9, 16, 100]
    }

    /*
    2. YOL
     */
    public static int[] sortedArray(int[] num) {

        int i = 0;
        for (; i < num.length; i++) {
            num[i] = num[i] * num[i];
        }
        Arrays.sort(num);
        return num;
    }

}

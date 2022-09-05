package Recap_day1;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme

        int yaş = 53;
        double boy = 1.70;
        System.out.println("yaş = " + yaş);
        System.out.println("boy = " + boy);


        // To copy the variable's value

        int yaşim = 33;
        int enesYaş = yaşim;
        System.out.println("yaşim = " + yaşim);
        System.out.println("enesYaş = " + enesYaş);


        // you can declare multiple variables in the same line

        int yil = 2022, ay = 6, gün = 20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gün = " + gün);


        // updating a variable

        yil = 2032;
        System.out.println("uptade yil = " + yil);


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin


        int x; // declare variable
        int y = 2000; // initialized, aynı zamanda assignment
        x = 30; // x'in initialized
        y = 1; // y'in initialized

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}

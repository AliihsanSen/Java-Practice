package Recap_day1;

public class Q05_EscapeSequences {
         /*
    yazdırılamayan karakterleri karakter ve dize değişmezlerine koymak için kullanılırlar .
    Örneğin, sekme, satır başı ve geri alma gibi karakterleri bir çıkış akışına koymak için kaçış dizilerini kullanabilirsiniz.
      \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir.
              \": prints double quote :"" cift tirnak yazdirir.
     \: backslash
     /:front slash
     */

    public static void main(String[] args) {

        // Soru 1-) konsola "hello" , "world" \ //*" yazdiriniz. (Kod şeklinde yazdiriniz)

        System.out.println("\"Hello \", \"World \\ //\"");

        // Soru 2-) Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdiriniz.

        System.out.println(" P \n A \n Z \n A \n R \n T \n E \n S \n İ");

        // Soru 3-) "Java" ile hayat çok 'afilli'. yazdiriniz.

        System.out.println("\"Java\", ile hayat çok \'afilli\'.");

        /*
         Soru 4-) "Zaruret"insani
                    'kasif' yapar yazdiriniz.
         sonraki "TechProEd ile java cok kolay ..." ifadesi 3 satir sonra veriniz.
         */

        System.out.println("\"Zaruret\" insani \n \'kasif\' yapar yazdiriniz \n \n \n \t\"TechProEd ile java cok kolay ...\" ");


    }
}

package prvi_java_test;

import java.util.Scanner;

public class Zadatak4 {

//         Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//         konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//         izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//         U glavnom programu pozvati funkciju za neki od primera.
//         Primer poziva funkcija:
//         Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 350.1
//         Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 4.995
//         Primer izvrsenja main programa:
//         Unesite vrednost u eurima: 3
//         Unesite valutu za konverziju: RSD
//         3 EUR je 350.1 RSD
//         Konverzija eura u druge valute:
//         1 EUR = 116.70 RSD
//         1 EUR = 1.11 USD
//         1 EUR = 89.24 RUB


            public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

                System.out.print("Unesite vrednost u eurima: ");
                int euro = s.nextInt();

                System.out.print("Unesite valutu za konverziju: ");
                String valuta = s.next();

                double convertuj = convertorValute(euro, valuta);
                System.out.println(euro + " EUR je " + convertuj + " " + valuta);

            }      public static double convertorValute(int euro, String valuta) {
        if(valuta.equals("RSD")) {
            return euro * 117.2;
        } else if (valuta.equals("USD")) {
            return  euro * 1.2;
        } else if (valuta.equals("RUB")) {
            return euro * 89.23;
        }  else {
            return 0;

        }

    }
}





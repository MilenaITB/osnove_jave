package prvi_java_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5_1 {

// // Zadatak (For petlja)
////Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
//// Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//// tj. ne unosi ih korisnik.
//// Program stampa tabelu na ekranu a zatim od korisnika trazi da unese kolonu
//// po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu.
//// POGLEDAJ SLIKU
////Primer izvrsenja:
////3,1,8,0,1,
////1,5,7,9,6,
////3,1,6,5,1,
////4,5,8,1,7,
////1,3,2,8,0,
////Unesite kolonu za sumiranje: 2
////Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva=new ArrayList<>();

        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        nizBrojeva.add(1);
        nizBrojeva.add(1);
        nizBrojeva.add(5);
        nizBrojeva.add(7);
        nizBrojeva.add(9);
        nizBrojeva.add(6);
        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(6);
        nizBrojeva.add(5);
        nizBrojeva.add(1);
        nizBrojeva.add(4);
        nizBrojeva.add(5);
        nizBrojeva.add(8);
        nizBrojeva.add(1);
        nizBrojeva.add(7);
        nizBrojeva.add(1);
        nizBrojeva.add(3);
        nizBrojeva.add(2);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
            if (i==4) {
                System.out.println();
            }
            if (i==9) {
                System.out.println();
            }
            if (i==14) {
                System.out.println();
            }
            if (i==19) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.print("Unesite kolone od 0-4: ");
        int n = s.nextInt();
        int zbir = 0;
        for (int i = n; i < nizBrojeva.size(); i=i+5) {
            zbir = zbir + nizBrojeva.get(i);
        }
        System.out.print("Zbir je: " + zbir);
    }
}





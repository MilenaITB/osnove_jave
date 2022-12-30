package prvi_java_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

// Zadatak (For petlja)
//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
// Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
// tj. ne unosi ih korisnik.
// Program stampa tabelu na ekranu a zatim od korisnika trazi da unese kolonu
// po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu.
// POGLEDAJ SLIKU
//Primer izvrsenja:
//3,1,8,0,1,
//1,5,7,9,6,
//3,1,6,5,1,
//4,5,8,1,7,
//1,3,2,8,0,
//Unesite kolonu za sumiranje: 2
//Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        niz.add(3);
        niz.add(1);
        niz.add(8);
        niz.add(0);
        niz.add(1);
        niz.add(1);
        niz.add(5);
        niz.add(7);
        niz.add(9);
        niz.add(6);
        niz.add(3);
        niz.add(1);
        niz.add(6);
        niz.add(5);
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(8);
        niz.add(1);
        niz.add(7);
        niz.add(1);
        niz.add(3);
        niz.add(2);
        niz.add(8);
        niz.add(0);


        for (int i = 0; i < 25; i++) {
            System.out.print(niz.get(i) + " ");

            if((i+1)%5==0){
                System.out.print("\n");}
        }

        System.out.print("Unesite kolonu po kojoj zelite da sumirate vrednosti: ");
        int kolona = s.nextInt();
        int suma =0;
        for (int i = 0; i < 25; i+=5) {
            suma = suma+niz.get(kolona+i);
        } System.out.print("Suma je " + suma);
//        int suma = niz.get(kolona)+niz.get(kolona+5)+niz.get(kolona+10)+niz.get(kolona+15)+niz.get(kolona+20);



    }
}





package p21_12_2022;

import java.util.ArrayList;


//2.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i menja vrednost elementa
// na poziciji 3 tako sto je povecava 10 puta.
public class Zadatak2 {
    public static void main(String[] args) {


        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(43);
        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(3);

//        int x = brojevi.get(3) * 10;
        brojevi.set(3, brojevi.get(3) * 10);


//      int a = 10;
//        a = a * 10;



    }
}




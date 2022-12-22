package p21_12_2022;

import java.util.ArrayList;


// 3.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog
// (na poziciji nula) i zadnjeg elemnta niza.

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(43);
        int poslednjiIndex = brojevi.size() - 1;

        int staraNulta = brojevi.get(0);
        int staraPoslednja = brojevi.get(poslednjiIndex);


        brojevi.set(0, staraPoslednja); // na nultoj poslednji
        brojevi.set(poslednjiIndex, staraNulta); // na poslednjem vrednost iz nultog






    }
}
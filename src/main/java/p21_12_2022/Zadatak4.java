package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;


// 4.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
// K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(43);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite K:");
        int k = s.nextInt();

        System.out.println("Vrednost je " + brojevi.get(k));


    }
}
package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;


//  8.Zadatak
//Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih stampa.
// Potrebne su dve petlje, u jednom se desava ucitavanje niza a u drugoj stampanje.
//Primer:
//Unesite N: 10
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 9
//Unesite broj: 2
//Unesite broj: 1
//Unesite broj: 7
//Unesite broj: 5
//Niz je:
//1, 2, 3, 4, 8, 9, 2, 1, 7, 5
public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        System.out.println("Unesite N:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();

            brojevi.add(broj);
        }

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");
        }


    }
}
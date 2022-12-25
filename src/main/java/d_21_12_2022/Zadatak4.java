package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


//
//4.	. Napisati program koji ucitava niz A duzine N i broj X.
// Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//	Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//1, 3

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            brojevi.add(i, broj);
        }

        System.out.print("Unesite X: ");
        int x = s.nextInt();

        System.out.println("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: ");
        for (int i = 0; i < brojevi.size(); i++) {
            if(brojevi.get(i) == x) {
                System.out.print(i + ", ");
            }
        }

    }
}
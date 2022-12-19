package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

  //  Napisati porogram koji od korisnika ucitava dva broja M i N
        //  i stampa sve brojeve izmedju M i N. Smatrajte da je M manje od N.
        //Primer izvrsenja:
        //Unesite M: 10
        //Unesite N: 15
        //10, 11, 12, 13, 14, 15,
        //Print da vam bude u jednom redu i sa zarezima!

       Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost m: ");
        int m = s.nextInt();

        System.out.println("Unesite vrednost n: ");
        int n = s.nextInt();

        for (int i = m; i <= n ; i++) {
            System.out.print(i + " , ");
        }

        }

            }















package p26_12_2022;


// 6. Zadatak
//Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red..
// Broj zvezdica je odredjen parametrom N.
//Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//N=5, print je=> * * * * *
//
//Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//N=9, print je=> * * * * *

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        int m = 5;
        for (int i = 1; i <= m; i++) {
            zvezdice(i);
        }

//        zvezdice(1);
//        zvezdice(2);
//        zvezdice(3);
//        zvezdice(4);
//        zvezdice(5);

    }

    public static void zvezdice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}



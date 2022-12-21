package p20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {



        // 2.     Zadatak
        //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
        //Primer:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:1
        //Unesite broj:0
        //Kraj programa jer je uneto 2 nule.


        Scanner s = new Scanner(System.in);
        int brojac = 0; // broj unetih nula

        while (brojac < 2) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();
            if (broj == 0) {
                brojac++;
            }
        }

        System.out.println("Kraj programa jer je uneto 2 nule.");

    }
}












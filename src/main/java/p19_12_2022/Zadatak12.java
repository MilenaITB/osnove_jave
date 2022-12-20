package p19_12_2022;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {



//      Napisati program prikazuje koliko je svaki od unetih passworda jak.
//      Korisnik unosi N passworda i za svaki se ispisuje jacina.
            //Svaki uslov koji password ispunjava dodaje po 1 poen:
            //duzina veca od 8
            //sadrzi @ specijalan karakter
            //
            //		Primer izvrsenja:
            //		Unesite N: 3
            //		Unesite password: passwdr
            //		Password ima 0 poena.
            //Unesite password: password123
            //		Password ima 1 poena.
            //		Unesite password: password@123
            //		Password ima 2 poena.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int poeni = 0;
            System.out.println("Unesite password");
            String password = s.next();

            if (password.length() > 8) {
                poeni = poeni + 1;
            }

            if (password.contains("@")) {
                poeni = poeni + 1;
            }

            System.out.println("Password ima " + poeni + " poena.");
        }


    }
}
















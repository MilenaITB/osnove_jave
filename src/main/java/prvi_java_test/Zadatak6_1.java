package prvi_java_test;

import java.util.Scanner;

public class Zadatak6_1 {

// Zadatak (While petlja)
//Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
// Lozinka je validna ukoliko ima minimum 8 karaktera
// i sadrzi bar jedan od dva specijalna karaktera a specijalni karakteri su @ i #
//Primer izvrsenja:
//Unesite lozinku: ITBootcamp
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp12
//Lozinka nije validna.
//Unesite lozinku: ITBoo@
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp@
//Lozinka je validna.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String lozinka = " ";

            boolean validnaLozinka = false;

        while (!validnaLozinka) {
            System.out.print("Unesite lozinku: ");
            lozinka = s.next();
            if (lozinka.length() >= 8 && (lozinka.contains("@") || lozinka.contains("#"))) {
                validnaLozinka = true;
                System.out.println("Lozinka je validna");
            } else {
                System.out.println("Lozinka nije validna. ");
            }
        }
    }
}
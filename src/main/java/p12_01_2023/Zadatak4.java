package p12_01_2023;
// 3.Zadatak
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
// Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
        // hoću da dodam novi element u niz

//        sastojci.add(new Sastojak("kafa", 150));
//        sastojci.add(new Sastojak("sercer", 100));
//        sastojci.add(new Sastojak("piletina", 300));

//          hoću korisnik da mi da podatke

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");   // N kaže koliko sastojaka hoće
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {    // n pita korisnika n puta za naziv i cenu
            System.out.println("Unesite naziv: ");
        String naziv = s.next();
            System.out.println("Unesite cenu: ");
            int cena = s.nextInt();           // od ovih inf.moramo da napravimo novi objekat koji čuva te inf.
           Sastojak x = new Sastojak(naziv, cena);        // tako da nam u petlji treba novi sastojak
                                            // i taj sastojak treba da dobije naziv i cenu.
           sastojci.add(x);                    // i sad taj novi OBJEKAT treba da dodamo u niz

        }

        // niz ima 3 sastojka i kad prođemo kroz ovaj niz i
        // odštampamo podatke
 //       for (int i = 0; i < sastojci.size(); i++) {
//            System.out.println(sastojci.get(i).getNaziv() + "- " + sastojci.get(i).getCena());

        for (int i = 0; i < sastojci.size(); i++) {
            sastojci.get(i).stampaj();
        }


    }
}






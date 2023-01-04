package p27_12_2022;

// 1.Zad
////		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//      Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//      Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun posiljalac = new Racun();
        posiljalac.broj = "823-329329-32932";
        posiljalac.vlasnik = "Milan Jovanovic";
        posiljalac.stanje = 1000.0;


        Racun primalac = new Racun();
        primalac.broj = "823-32455-5454";
        primalac.vlasnik = "Petar Petrovic";
        primalac.stanje = 500.0;


        System.out.println(posiljalac.vlasnik+ ", "
                + posiljalac.broj + ", stanje:" + posiljalac.stanje);


        System.out.println(primalac.vlasnik+ ", "
                + primalac.broj + ", stanje:" + primalac.stanje);

        System.out.println("Unesite transakciju:");
        int suma = s.nextInt();

        posiljalac.stanje = posiljalac.stanje - suma;
        primalac.stanje = primalac.stanje + suma;



        System.out.println(posiljalac.vlasnik+ ", "
                + posiljalac.broj + ", stanje:" + posiljalac.stanje);


        System.out.println(primalac.vlasnik+ ", "
                + primalac.broj + ", stanje:" + primalac.stanje);

    }
}
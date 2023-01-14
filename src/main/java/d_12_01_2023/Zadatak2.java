package d_12_01_2023;
//Zadatak
//Kreirati klasu Racun koja ima:
//broj racuna (npr: 170-289328923-23)
//ime i prezime osobe
//trenutno stanje na racunu (npr: 100, 1220)
//gettere i setter za sve atribute, sem settera za stanje na racunu
//metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
//
/////
//
//		Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1%
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da
// metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
// Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
// a na drugi racun dodaje samo (trazena suma).

//	Naravno u glavnom kreirati objekte i testirati funkcionalnosti

public class Zadatak2 {
    public static void main(String[] args) {

        Racun posiljalac = new Racun("1234-5678-1258", 4000);

        posiljalac.setImeIPrezime("Milan Jovanovic");

        Racun primalac = new Racun("170-289328923-23", 2000);

        primalac.setImeIPrezime("Vladimir Minic");

        Transakcija t1 = new Transakcija("123", posiljalac, primalac);
        t1.izvrsiTransakciju(2000);
        t1.stampaj();

        System.out.println();

        posiljalac.stampaj();
        primalac.stampaj();

    }
}
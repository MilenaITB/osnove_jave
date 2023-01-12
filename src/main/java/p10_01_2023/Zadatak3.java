package p10_01_2023;
// 3.Zadatak
//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//reziser
//konstruktore, gettere i settere
//getter i setter za rezisera
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//Rezirao ga: ime i prezime rezisera, starost
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
//Napravite vezu izmedju objekata i pozovite metode.


public class Zadatak3 {
    public static void main(String[] args) {
        Film f1 = new Film("Inception", 2009);
        Film f2 = new Film("BLa bla", 2005);

        Reziser r = new Reziser("Pera Peric", 28);

        r.setReziraoJe(f1);
        r.setReziraoJe(f2);
        r.stampaj();
    }
}
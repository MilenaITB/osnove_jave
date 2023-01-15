package p13_01_2023;

public class UvodniZadatak {
    public static void main(String[] args) {
        Reziser r = new Reziser("Milan Jovanovic", 27);
        Film b1 = new Film("Bla bla 1", 2007);
        Film b2 = new Film("Bla bla 2", 2009);

        r.stampaj();

        r.dodajFilm(b1);
        r.dodajFilm(b2);
        r.dodajFilm("Bla bla 3", 2012);

        r.stampaj();

        System.out.println("D");
    }
}
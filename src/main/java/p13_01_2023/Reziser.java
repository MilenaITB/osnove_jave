package p13_01_2023;

import java.util.ArrayList;

// pravim vezu gde jedan režiser ima vezu sa više filmova.
// To znači da veza treba da bude u klasi režiser
import java.util.ArrayList;
public class Reziser {
    private String imeIPrezime;
    private int starost;

    //  i vezu ostvarujemo tako što pravimo ATRIBUT koji je po tipu ArrayLista
//  i ona treba da bude određenog TIPA
//  one classe sa čijim OBJEKTIMA hoću da pravim vezu
// private ArrayList je TIP promenljive, a FILM je NIZ
    private ArrayList<Film> filmovi;
    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }
    public Reziser() {
        this.filmovi = new ArrayList<>();
    }
    // difoltni konstruktor, ako ga pravim treba da se napravi kreiranje niza
    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
        this.filmovi = new ArrayList<>();
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public int getStarost() {
        return starost;
    }
    public void setStarost(int starost) {
        this.starost = starost;
    }
// pravim metodu za vezu
    public void dodajFilm(Film film) {
        this.filmovi.add(film);
    }
    // metoda koja primi sve podatke 1 filma
    public void dodajFilm(String nazivFilma, int godinaFilma) {
        // moram da napravim OBJEKAT
        Film f = new Film(nazivFilma, godinaFilma);
        this.filmovi.add(f);
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.imeIPrezime);
        System.out.println("Starost: " + this.starost);
        for (int i = 0; i < this.filmovi.size(); i++) {
            System.out.println("Film: " + this.filmovi.get(i).getNaziv() +
                    " " + this.filmovi.get(i).getGodina());
        }
    }

}
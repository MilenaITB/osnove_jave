package p13_01_2023;

import java.util.ArrayList;

//        Kreirati klasu FacebookPost koja ima:
//        ime i prezime korisnika koji je stavio oglas
//        tekst objave
//        niz reakcija
public class FacebookPost {
    private String autor;
    private String opis;
    private ArrayList<Reakcija> reakcije;

    // ako pravimo difoltni konstruktor
    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    // ako primamo konstruktor koji prima oba parametra
    public FacebookPost(String autor, String opis) {
        // u tom konstruktoru ide i kreiranje ovog niza
        this.reakcije = new ArrayList<>();
        // i setujemo ove parametre
        this.autor = autor;
        this.opis = opis;
    }

    //        metodu reaguj, koja dodaje reakciju u niz
    // ova metoda treba da primi OBJEKAT REAKCIJU
    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getReagovao().equals(reakcija.getReagovao())){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija); // i tu reakciju samo da doda u niz
    }
// metoda koja nam vraća broj reakcija određenog tipa
    // ova metoda treba da primi parametar koji tip treba da broji
    public int izbrojiReakcije(String tip) {
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(tip)) {
                counter++;
            }
        }
        return counter;
    }

    public void stampaj() {
        System.out.println("IME I PREZIME: " + this.autor);
        System.out.println("OPIS: " + this.opis);
        System.out.print("Lajk " + this.izbrojiReakcije("lajk") + " | ");
        System.out.print("Srce " + this.izbrojiReakcije("srce") + " | ");
        System.out.print("Smajli " + this.izbrojiReakcije("smajli") + " | ");

    }

}
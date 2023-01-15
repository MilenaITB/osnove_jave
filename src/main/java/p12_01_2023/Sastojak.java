package p12_01_2023;
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
public class Sastojak {

    public String naziv;
    public int cena;

    // geteri i seteri

    public String getNaziv() {
        return naziv;
    }
    public int getCena() {
        return cena;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }

    // konstruktor
    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    //  metoda za štampu
    public void stampaj() {
        System.out.println("Naziv: " + this.naziv + ", cena: " + this.cena);
    }


    }


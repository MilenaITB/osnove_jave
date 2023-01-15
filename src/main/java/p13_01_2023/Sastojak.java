package p13_01_2023;

import java.util.ArrayList;

//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.


//Kreirati klasu Sastojak koja ima:
public class Sastojak {
    //naziv
//cenu
    private String naziv;
    private int cena;


        //gettere i settere
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }

        //konstruktore
    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    //   metodu za stampanje koja stampa  podatke u formatu:
//       naziv - cena.din
    public void stampa(){
        System.out.println("Naziv: " + this.naziv + " - cena " + this.cena + " din.");

}
}


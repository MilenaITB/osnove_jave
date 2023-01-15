package p13_01_2023;

import java.sql.Array;
import java.util.ArrayList;

// Kreirati klasu Pasta koja ima:
//po TIPu je NIZ sastojaka, a ATRIBUT se zove sastojci
public class Pasta {
        private String naziv;
        private ArrayList<Sastojak> sastojci;


        //defaultni konstruktor je DIFOLTNI
        // u njemu MORAMO da kreiramo NIZ
        public Pasta()  {
                this.sastojci = new ArrayList<>();
        }
        // i za taj NIZ dodaću samo geter, jer seter NE treba da postoji,
        // jer ja setujem, ja pravim taj NIZ
        public Pasta(String naziv) {
                this.naziv = naziv;
                this.sastojci = new ArrayList<>();
        }
        public ArrayList<Sastojak> getSastojci() {
                return sastojci;
        }

        //metodu za dodavanje sastojka,
        // prima OBJEKAT i samo ga doda u NIZ
        public void dodajSastojak(Sastojak sastojak) {
                this.sastojci.add(sastojak);
        }


        //metodu koja racuna cenu paste, ova METODA NE PRIMA PARAMETRE
        // jer sve što nam je potrebno imamo u ovom NIZu
        // tako sto sumira cene svih sastojaka
//        public double cenaPaste(){
//                double sum = 0;
//                for (int i = 0; i < sastojci.size(); i++) {
//                        sum = sum +sastojci.get(i).getCena();
//                } return sum;
//        }.........moja kombinacija sa časa


        // a ovo je Milanova
        // pravimo SUMU
        public int cena () {
                int suma = 0;
                      // PETLJU koja ide do kraja NIZa
                for (int i = 0; i < this.sastojci.size(); i++) {
                        suma += this.sastojci.get(i).getCena();
                }
                return suma;   // i na sumu dodam cenu svakog sastojka
                // na kraju METODE vratim sumu
        }

                //metodu za stampu koja stampa podatke u formatu:
//      Pasta je sa sastojcima:
//      naziv - cena.din
//      naziv - cena.din
//      naziv - cena.din
//      Cena paste je cena.din
//                      ...........................moje rešenje sa časa
//        public void stampaj(){
//                System.out.println("Pasta je sa sastojcima: ");
//                for (int i = 0; i < sastojci.size(); i++) {
//                        sastojci.get(i).stampa();
//                }
//                System.out.println("Cena paste je: " + this.cenaPaste() + " din.");
//    Milanovo rešenje

                public void stampaj(){
                        for (int i = 0; i < this.sastojci.size(); i++) {
                                this.sastojci.get(i).stampa();  // od svakog sastojka imamo metodu za štampu
                        }
                        System.out.println("Cena: " + this.cena());
        }
        // (ostavite za kraj) metodu za brisanje sastojka.
        // U metodu se salje naziv sastojka koji se brise.
        public void obrisiSastojak(String naziv) {
                for (int i = 0; i < this.sastojci.size(); i++) {
                        if(this.sastojci.get(i).getNaziv().equals(naziv)) {
                                this.sastojci.remove(i);
                        }
                }
        }


}



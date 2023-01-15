package p13_01_2023;

// U glavnom programu kreirati objekte i testirati funkcionalnosti
//(ostavite za kraj) metodu za brisanje sastojka.
// U metodu se salje naziv sastojka koji se brise.

public class Zadatak1 {
    public static void main(String[] args) {
//      moje rešenje sa časa
//        Sastojak sastojak1 = new Sastojak("pecurka", 150);
//        sastojak1.stampa();
//        Sastojak sastojak2 = new Sastojak("tunjevina", 550);
//        sastojak2.stampa();
//        Sastojak sastojak3 = new Sastojak("mozzarela", 150);
//        sastojak3.stampa();
//        Sastojak sastojak4 = new Sastojak("povrce", 250);
//        System.out.println();
//
//        Pasta pasta1 = new Pasta();
//        pasta1.dodajSastojak(sastojak1);
//        pasta1.dodajSastojak(sastojak2);
//        pasta1.dodajSastojak(sastojak3);
//        pasta1.dodajSastojak(sastojak4);
//
//        pasta1.stampaj();

        // MILANOVO rešenje

        Pasta karbonara = new Pasta();
        karbonara.dodajSastojak(new Sastojak("pene", 50));
        karbonara.dodajSastojak(new Sastojak("slanina", 100));
        karbonara.dodajSastojak(new Sastojak("pavlaka", 50));
        karbonara.dodajSastojak(new Sastojak("piletina", 120));
        karbonara.stampaj();

        // brisanje sastojka
        System.out.println("NAKON BRISANJA");
        karbonara.obrisiSastojak("piletina");
        karbonara.stampaj();



    }
}

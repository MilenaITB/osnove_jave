package p12_01_2023;

//Kreirati klasu Ugovor koja ima:
//godinu, dan i mesec sklapanja ugovora
//osobu koja prodaje nekretninu (fizicko lice)
//osobu koja kupuje nekretninu (fizicko lice)
//cenu za koju se prodaje nekretnina
//adresu nekretnine (ulica br., grad)
//public class Ugovor {
//    private String dan;
//    private String mesec;
//    private String godina;
//    private String adresa;
//    private double cena;
//    private FizickoLice kupac;
//    private FizickoLice prodavac;
//
//
//
//// kreiram 1 konstruktor koji prima sve parametre
//
//
//    public Ugovor(String dan, String mesec, String godina,
//                  String adresa, double cena, FizickoLice kupac,
//                  FizickoLice prodavac) {
//        this.dan = dan;
//        this.mesec = mesec;
//        this.godina = godina;
//        this.adresa = adresa;
//        this.cena = cena;
//        this.kupac = kupac;
//        this.prodavac = prodavac;
//    }
//    // postavljam samo getere
//    // jer sve ostalo ne bi trebala i ne mogu da menjam
//    public String getDan() {
//        return dan;
//    }
//
//    public String getMesec() {
//        return mesec;
//    }
//
//    public String getGodina() {
//        return godina;
//    }
//
//    public String getAdresa() {
//        return adresa;
//    }
//
//    public double getCena() {
//        return cena;
//    }
//
//    public FizickoLice getKupac() {
//        return kupac;
//    }
//
//    public FizickoLice getProdavac() {
//        return prodavac;
//    }
//
//    //metodu koja vraca procenat zarade
////za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//    // TERNARNI OPERATOR:  booleanExpression ? expresion1 : expression2
////    private double procenatZarade() {
////        if (this.kupac.isKupovao()){
////            return 0.02;
////        } else {
////            return 0.03;
//        //      }
//
//// pitalo bi se:
// //       return this.kupac.isKupovao() ? 0.02 : 0.03; // ukoliko je kupac kupovao - onda ? je
//        // tada % 0.02 i to je sve za returne
//        // to NE koristim za neke teške kombinacije. To koristim uglavnom kada nešto RAČUNAM
//        // ili kada nešt VRAĆAM
//        // ako imam više uslova TERNARNI operator NE koristim.
//        // Koristim ga samo da zamenim jedan if/else
//
//    private double procentaZarade() {
//        return this.kupac.isKupovao() ? 0.02 : 0.03;
//    }
//
//    public double racunajZaradu() {
//        return 1000 + this.cena * this.procentaZarade();
//
//    }
//
//
//    // //metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze,
//    //// takse i usluge agencije, prema formuli:
//    ////1000 + cena za koju se prodaje * procenat zarade
//
// //   public double racunajZaradu() {              // ova metoda računa tako što da fix.ovu cenu, 1000€
// //       return 1000 + this.cena * this.procenatZarade(); // ova metoda ne prima parametre
//        //    jer sve što je potrebno za ovu formulu imamo u objektu
//
//
//    //metodu koja stampa ugovor u formatu:
////Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca)
//// o kupovini nekretnine (adresa) po ceni od (cena nekretnin)
//// pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
//
//        //   System.out.println();  do sada sam ovako radila štampu
//        // a sada mogu:
//        public void stampajUgovor() {
//            System.out.println(String.format("Dana %s %s %s god sklopljen je ugovor izmedju %s i %s " +
//                            "o kupovini nekretnine %s po ceni od %s" +
//                            " pri cemu je kupac u obavezi da agenciji isplati novcanu " +
//                            "vrednost u iznosu od %f",
//                    this.dan,
//                    this.mesec,
//                    this.godina,
//                    this.prodavac.getImeIPrezime(),
//                    this.kupac.getImeIPrezime(),
//                    this.adresa,
//                    this.cena,
//                    this.racunajZaradu()));
//        }
//}
//            // METODA koja omogućava da lako menjam neke vrednosti u nekom Stringu
//            // Ova metoda FORMAT ima opciju da gde god hoću da zamenim neku vrednost, stavljam %s za Stringove
//            // npr.hoću da zamenim dan, pišem %s......za double %f......
//            // i ova METODA FORMAT vrati novi String x = koji dobije tako što odradi supstituciju ovom originalnom stringu
//            // pošto samo štampam, mogu da vratim u ovaj standardni format, "sout..."



public class Ugovor {
    private String dan;
    private String mesec;
    private String godina;
    private String adresa;
    private double cena;
    private FizickoLice kupac;
    private FizickoLice prodavac;

    public Ugovor(String dan, String mesec, String godina,
                  String adresa, double cena, FizickoLice kupac,
                  FizickoLice prodavac) {
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
        this.adresa = adresa;
        this.cena = cena;
        this.kupac = kupac;
        this.prodavac = prodavac;
    }

    public String getDan() {
        return dan;
    }

    public String getMesec() {
        return mesec;
    }

    public String getGodina() {
        return godina;
    }

    public String getAdresa() {
        return adresa;
    }

    public double getCena() {
        return cena;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }


    private double procentaZarade() {
        return this.kupac.isKupovao() ? 0.02 : 0.03;
    }

    public double racunajZaradu() {
        return 1000 + this.cena * this.procentaZarade();

    }

    public void stampajUgovor() {
        System.out.println(String.format("Dana %s %s %s god sklopljen je ugovor izmedju %s i %s " +
                        "o kupovini nekretnine %s po ceni od %s" +
                        " pri cemu je kupac u obavezi da agenciji isplati novcanu " +
                        "vrednost u iznosu od %f",
                this.dan,
                this.mesec,
                this.godina,
                this.prodavac.getImeIPrezime(),
                this.kupac.getImeIPrezime(),
                this.adresa,
                this.cena,
                this.racunajZaradu()));
    }
}




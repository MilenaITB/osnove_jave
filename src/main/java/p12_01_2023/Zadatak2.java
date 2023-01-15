package p12_01_2023;

public class Zadatak2 {
// Zadatak
//Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//ime i prezime
//broj licne karte
//jmbg
//podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//konstuktore
//gettere i settere, jmbg ne sme da se menja
//metodu stampaj, koja stmpa podatke u formatu:
//ime i prezime, broj licne karte
//
//	Kreirati klasu Ugovor koja ima:
//godinu, dan i mesec sklapanja ugovora
//osobu koja prodaje nekretninu (fizicko lice)
//osobu koja kupuje nekretninu (fizicko lice)
//cenu za koju se prodaje nekretnina
//adresu nekretnine (ulica br., grad)
//metodu koja vraca procenat zarade
//za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije,
// prema formuli:
//1000 + cena za koju se prodaje * procenat zarade
//metodu koja stampa ugovor u formatu:
//Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca)
// o kupovini nekretnine (adresa) po ceni od (cena nekretnin)
// pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

//    public static void main(String[] args) {
//        // pravim 2 objekta.....Milan: kad napravi class-u pravi odmah i objekte, tako je lakše
//        // 1.objekat sa 1.konstruktorom
//        FizickoLice m = new FizickoLice("1709986735020");
//        m.setKupovao(false);
//        m.setImeIPrezime("Milan Jovanovic");
//
//
//        // 2.objekat
//        FizickoLice n = new FizickoLice("Nikola Nikolic", "23879",
//                "1709986735020", true);
//
//        Ugovor ugovor = new Ugovor("10", "12", "2022","Nikole Pasica 10",
//                50500, n, m);
//        ugovor.stampajUgovor();
//    }
//}

        public static void main(String[] args) {
            FizickoLice m = new FizickoLice("912912921");
            m.setBrlk("3290329023");
            m.setKupovao(false);
            m.setImeIPrezime("Milan Jovanovic");


            FizickoLice n = new FizickoLice("Nikola Nikolic",
                    "21912821", "12921912", true);

            Ugovor ugovor = new Ugovor("10", "12", "2023",
                    "Nikole Pasica 10", 10000, n, m);

            ugovor.stampajUgovor();
        }
    }

package v_16_01_2023;
///1.Zadatak
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//        (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
//        na kraju programa ispisati sve igrace i trenere.
//        Podatke za igrace i trenere unosi korisnik sa tastature.
//

public class Zadatak1 {
    public static void main(String[] args) {
        Trener t1 = new Trener("Petar Petrovic",
                "285966545",
                1975,
                10,
                "glavni");

        Igrac i1 = new Igrac("Milan Jovanovic",
                "2589958776",
                1995,
                8,
                "centar",
                true);

        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("crveni");

        i1.dodajKarton(k1);
        i1.dodajKarton(k2);
        i1.dodajKarton(k1);
        i1.dodajKarton(k1);

        t1.stampajTrenera();
        i1.stampajIgraca();
    }
}
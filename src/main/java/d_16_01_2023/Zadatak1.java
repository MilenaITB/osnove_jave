package d_16_01_2023;
//1.Zadatak
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


public class Zadatak1 {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Milan Jovanovic",
                "2505995730051","1995." ,
                15, "napadac", true );
        Igrac igrac2 = new Igrac("Vladimir Minic", "1502995730014", "1995." ,
                8, "odbrana", false);


        igrac1.stampaj();
        System.out.println();
        igrac2.stampaj();


        Trener trener1 = new Trener("Petar Petrovic", "2404990730015", "1990",
                8, "glavni");
        System.out.println();
        Trener trener2 = new Trener("Jovica Ilic", "2806990730023", "1990",
                3, "kondicioni");



        trener1.stampaj();
        System.out.println();
        trener2.stampaj();

    }
}

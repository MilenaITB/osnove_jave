package p29_12_2022;
// // (Dopuna 3)
////Dopuniti klasu Auto tako da ima:
////atribut broj registracije
////da li je ukljucena klima u autu
////metodu dodajGas, koja povecava trenutnu brzinu za 10.
////metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
////metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
////faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
////(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
////
////	(Dopuna 4)
////	Dopuniti klasu Auto tako da ima:
////atribut za maksimalnu brzinu na auto (npr: 240)
////Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
////metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
////Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
////               |||||||||||||||||||||||||||||||||||||||||............................ 100/240km/h
////(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i
//// imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
////Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
////
////
////
////(Dopuna 5)
////Dopuniti klasu Auto tako da ima:
////kapacitet rezervoara
////trenutnu kolicinu goriva u rezervoaru (u litrima)
////metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci
//// a vraca novcanu vrednost goriva. Litar goriva je 210din..
//// Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
//// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
public class Zadatak3 {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.marka = "BMW";
        bmw.trenutnaBrzina = 180;
        bmw.fabrickaPotrosnja = 10;
        bmw.vozac = "Milan Jovanovic";
        bmw.brojVrata = 5;
        bmw.kubikaza = 2000;
        bmw.registrovanDo = 10;
        bmw.godinaProizvodnje = 1980;
        bmw.registracija = "NI-3292-32";
        bmw.ukljucenaKlima = true;
        bmw.maksimalnaBrzina = 240;
        bmw.kapacitetRezervoara = 50;
        bmw.trenutnoURezervoaru = 20;

        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGas(); // 250
        bmw.stampajTablu();
    }
}
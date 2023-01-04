package p29_12_2022;
// (Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//
//	(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||....................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i
// imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
//
//
//
//(Dopuna 5)
//Dopuniti klasu Auto tako da ima:
//kapacitet rezervoara
//trenutnu kolicinu goriva u rezervoaru (u litrima)
//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci
// a vraca novcanu vrednost goriva. Litar goriva je 210din..
// Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.


public class Auto {
//    ime i prezime vozaca
//    marku automobila
//    broj vrata
//    potrosnju na 100km (npr: 10)
//    trenutnu brzinu kojom se auto krece

    public String vozac;
    public String marka;
    public int brojVrata;
    public int fabrickaPotrosnja;
    public int trenutnaBrzina;

    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;

    public boolean otvorenGepek;
    public String registracija;
    public boolean ukljucenaKlima;
    public int maksimalnaBrzina;
    public int kapacitetRezervoara;
    public int trenutnoURezervoaru;


    public void stampaj() {
        System.out.println(this.vozac + "\n" +
                marka + " - "+this.brojVrata+"-ro vrata\n" +
                "Sa potrosnjom od "+this.fabrickaPotrosnja+" l na 100km\n" +
                this.trenutnaBrzina + " km/h je trenutna brzina.\n");
    }

    public boolean prekoracenje(int ogranicenje) {
//        if (this.trenutnaBrzina > ogranicenje) {
//            return true;
//        }
//        return false;
        return this.trenutnaBrzina > ogranicenje;
    }

    public int kazna (int ogracenje) {
//        55 - 50
//        int prekoracenje = this.trenutnaBrzina - ogracenje;
//        if (prekoracenje > 0) {
//            return prekoracenje * 1000;
//        }
//        return 0;
        if (this.prekoracenje(ogracenje)) {
            return (this.trenutnaBrzina - ogracenje) * 1000;
        }
        return 0;
    }


    public boolean oldTimer() {
//        if (this.godinaProizvodnje < 1950) {
//            return  true;
//        } else {
//            return  false;
//        }
        return this.godinaProizvodnje < 1950;
    }


    public boolean isteklaRegistracija(int trenutniMesec) {
//        if (trenutniMesec > this.registrovanDo) {
//            return true;
//        } else {
//            return false;
//        }
        return  trenutniMesec > this.registrovanDo;

    }


    public int cenaRegistracije() {
        int cena = kubikaza * 100;
        if (kubikaza > 2000) {
            cena = cena * 130 / 100;
        }
        return cena;
    }

    public void otvoriGepek() {
        this.otvorenGepek = true;
    }

    public void zatvoriGepek() {
        this.otvorenGepek = false;
    }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        if (this.trenutnaBrzina > this.maksimalnaBrzina) {
            this.trenutnaBrzina = this.maksimalnaBrzina;
        }
    }

    public void dodajGasZa(int dodajZa) {
        this.trenutnaBrzina = this.trenutnaBrzina + dodajZa;
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
    }

    //    public double trenutnaPotrosnja() {
//        double faktor = 1.0;
//        if (this.ukljucenaKlima) {
//            faktor = 1.2;
//        }
//        return this.trenutnaBrzina / 100.0 * this.fabrickaPotrosnja * faktor;
//    }{
//        double faktor = 1.0;
//        if (this.ukljucenaKlima) {
//            faktor = 1.2;
//        }
//        return  faktor;
//    }
    public double racunajFaktor(){
        double faktor = 1.0;
        if (this.ukljucenaKlima){
            faktor = 1.2;
        }
        return faktor;
    }
    public double trenutnaPotrosnja() {
        return this.trenutnaBrzina / 100.0 * this.fabrickaPotrosnja * this.racunajFaktor();
    }

    public void stampajTablu() {
        int brzinaUProcentima =  (this.trenutnaBrzina * 100) / this.maksimalnaBrzina;

        for (int i = 0; i < 100; i++) {
            if (i <= brzinaUProcentima) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }

        System.out.println(this.trenutnaBrzina + "/" + this.maksimalnaBrzina + "km/h");

    }

    public int natoci(int litraza) {
        int cena = 0;
        int razlika = this.kapacitetRezervoara - this.trenutnoURezervoaru;
        if (razlika >= litraza) {
            this.trenutnoURezervoaru = litraza;
            cena = litraza * 210;
        } else {
            this.trenutnoURezervoaru= this.kapacitetRezervoara;
            cena = razlika * 210;
        }
        return cena;
    }


}
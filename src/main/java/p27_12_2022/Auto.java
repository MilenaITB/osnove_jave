package p27_12_2022;

public class Auto {

//        public String imeVozaca;
//
//        public String markuAuta;
//
//        public String brojVrata;
//
//        public String potrosnja;
//
//        public String trenutnuBrzina;

    //[Vozac]
    //	[Marka] - [br vrata]-ro vrata
    //	Sa potrosnjom od [potrosnja] l na 100km
    //	[Trenutna brzina auta] km/h je trenutna brzina.
    //
    //Primer:
    //	Milan Jovanovic
    //	BMW - 5-ro vrata
    //	Sa potrosnjom od 10 l na 100km
    //	200 km/h je trenutna brzina

//        public void printPoruku() {
//            System.out.println(this.imeVozaca);
//            System.out.println(this.markuAuta + "-" + this.brojVrata );
//            System.out.println(this.potrosnja  + "od 10 l na 100km");
//            System.out.println(this.trenutnuBrzina + "je trenutna brzina");

    // MOJE REŠAVANJE NA ČASU

    //     MILANOVO REŠENJE


    //   public class Auto {
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


        public void stampaj() {
            System.out.println(this.vozac + "\n" +
                    marka + " - " + this.brojVrata + "-ro vrata\n" +
                    "Sa potrosnjom od " + this.fabrickaPotrosnja + " l na 100km\n" +
                    this.trenutnaBrzina + " km/h je trenutna brzina.\n");
        }

        public boolean prekoracenje(int ogranicenje) {
//        if (this.trenutnaBrzina > ogranicenje) {
//            return true;
//        }
//        return false;
            return this.trenutnaBrzina > ogranicenje;
        }

        public int kazna(int ogracenje) {
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
            return trenutniMesec > this.registrovanDo;

        }


        public int cenaRegistracije() {
            int cena = kubikaza * 100;
            if (kubikaza > 2000) {
                cena = cena * 130 / 100;
            }
            return cena;
        }

    }


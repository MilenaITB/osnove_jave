package p17_01_2023;
///	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica

public class MasterKartica extends PlatnaKartica {

    //  konstruktor sa parametrima
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    //  implementira metodu koja vrsi transakciju,
    //  tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija = 1.5 / 100.0 * iznos;
        this.suma = this.suma - iznos - provizija;
    }

    //  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232
    @Override
    public void stampaj() {
        System.out.print("Master Card: ");
        System.out.print(this.mesec + "/" + this.godina + ", ");
        System.out.println("$" + this.suma + ", " + this.brojKartice);
    }

    //  metoda naplatiOdrzavanje, koja sa racuna skida $2.
    public void naplatiOdrzavanje() {
        this.suma -= 2;
    }
}
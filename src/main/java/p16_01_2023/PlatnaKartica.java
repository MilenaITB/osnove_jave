package p16_01_2023;
//   Napraviti klasu PlatnaKartica koja ima
////        atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
////        atribut broj kartice  primer: 4012-1239-1221-3381
////        atribut godina - godina do kada vazi kartica
////        atribut mesec-  mesec do kada vazi kartica
////        konstruktor sa parametrima
////        gettere za sve atribute, bez settera
////        metodu dodajSredstva koja povecava sumu za unetu vrednost
////        metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
////        metodu koja stampa podatke o kartici u formatu:
////        4012-1239-1221-3381, 11/2019, $212
public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public double getSuma() {
        return suma;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public int getGodina() {
        return godina;
    }
    public int getMesec() {
        return mesec;
    }
// konstruktor
    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }
// metoda
    public void dodajSredstva(double iznos) {

        this.suma = this.suma + iznos;
    }
// metoda
    public void izvrsiTransakciju(double iznos) {

        this.suma = this.suma - iznos;
    }
// metoda
    public void stampaj() {

        System.out.println(this.brojKartice + "$" + this.suma);
    }
}
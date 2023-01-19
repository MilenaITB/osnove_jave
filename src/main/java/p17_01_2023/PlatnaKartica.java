package p17_01_2023;
//1 .Zadatak
////  Napraviti klasu apstraktnu PlatnaKartica koja ima
////  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
////  atribut broj kartice  primer: 4012-1239-1221-3381
////  atribut godina - godina do kada vazi kartica
////  atribut mesec-  mesec do kada vazi kartica

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    ////  gettere za sve atribute, bez settera
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

    ////  konstruktor sa parametrima
    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    ////  metodu dodajSredstva koja povecava sumu za unetu vrednost
    public void dodajSredstva(double iznos) {
        this.suma = this.suma + iznos;
    }

    ////  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
    public abstract void izvrsiTransakciju(double iznos); // apstrakna jer se transakcije
                                                            // razlikuju od kartice do kartice

    ////  apstraktnu metodu koja stampa podatke o kartici.
    public abstract void stampaj(); // tako da će i štampa onda da se razlikuje
    }

package v_19_01_2023;

///(15 poena)
// Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:

//jedinstveni celobrojni identifikacioni broj
//ime i prezime
public abstract class Planinar {
    protected int ID;
    protected String imeIPrezime;


    //Dok od javnih metoda:
//konstruktor koji postavlja sve atribute klase.

    public Planinar(int ID, String imeIPrezime) {
        this.ID = ID;
        this.imeIPrezime = imeIPrezime;
    }
    //gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije
    // tj. posle njihovog postavljanja u konstruktoru)
    public int getID() {
        return ID;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    //apstraktnu metodu štampaj
        public abstract void stampaj();

    //apstraktnu metodu koja vraca clanarinu planinara
    public abstract double clanarina();

    //apstraktnu metodu uspesanUspon
    // koja vraća informaciju da li će se
    //// planinar upešno popeti na planinu.
    //// Metoda kao ulazni parametar prima objekat tipa Planina.
    public abstract boolean uspesanUspon(Planina p);
}


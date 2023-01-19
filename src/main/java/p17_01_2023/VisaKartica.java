package p17_01_2023;
//  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
// ovlaceno lice,
// cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;

    //getter i setter za ovlasceno lice

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    //konstruktor sa parametrima
    public VisaKartica(int stanje, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(stanje, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    private double racunajProviziju(double iznos) {
//        double provizija = iznos * 0.018;
//        if (provizija < 4) {
//            return  4;
//        }
//        return  provizija;
        double provizija = iznos * 0.018;

//        uslov ? vrednostZaTrue : vrednostZaFalse;
        return provizija < 4 ? 4 : provizija;
    }

    //  implementira metodu izvrsiTransakciju,
    //  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
//      Najmanja provizija moze biti $4.

    @Override
    public void izvrsiTransakciju(double iznos) {
        this.suma = this.suma - iznos - this.racunajProviziju(iznos);
    }

    //  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
    @Override
    public void stampaj() {
        System.out.println("Visa Card");
        System.out.println(this.brojKartice + " " + this.mesec + "/ " + this.godina);
    }
}

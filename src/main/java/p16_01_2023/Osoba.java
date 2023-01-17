package p16_01_2023;
//	// 1.Zadatak
////		Kreirati klasu Osoba koja od atributa ima:
//// ime i prezime
//// jmbg
////konstuktor sa parametrima
////metodu stampaj koja stampa podatke u formatu
////			ime prezime, jmbg
////
//
public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println("Ime: " + this.imeIPrezime);
        System.out.println("JMBG: " + this.jmbg);
    }
}
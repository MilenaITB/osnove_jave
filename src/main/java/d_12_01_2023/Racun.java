package d_12_01_2023;
// 2. Zadatak

////Kreirati klasu Racun koja ima:
////broj racuna (npr: 170-289328923-23)
////ime i prezime osobe
////trenutno stanje na racunu (npr: 100, 1220)
public class Racun {
    private String broj;
    private String imeIPrezime;
    private double stanje;

    public Racun(String broj, double stanje) {
        this.broj = broj;
        this.stanje = stanje;
    }

    ////gettere i setter za sve atribute, sem settera za stanje na racunu

    public String getBroj() {
        return broj;
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public double getStanje() {
        return stanje;
    }
    ////metodu koja menja stanje na racunu za prosledjenu vrednost
    // (stanje na racunu ne moze da bude manje od nule)
    public void novoStanje(double stanje){
        this.stanje = stanje;
    }
    ////metodu koja stampa podatke o racunu u formatu:
////Ime i prezime  -  broj racuna
////stanje na racunu je (trenutno stanje) rsd.

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje);
    }
}
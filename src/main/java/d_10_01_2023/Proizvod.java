package d_10_01_2023;
// 2. Zadatak (POGLEDAJ SLIKU)
//Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;
    public Proizvod(String naziv, Kupac kupac, double cena){
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double racunajCenu(){
        return cenaIzrade * 1.9 * (100 - kupac.getKartica().getPopust()) / 100;
    }
    public void stampaj(){
        System.out.println(naziv + " - " + racunajCenu());
        System.out.println(kupac.getImeIPrezime() + " - " + kupac.getKartica().getBrojKartice());
    }
}

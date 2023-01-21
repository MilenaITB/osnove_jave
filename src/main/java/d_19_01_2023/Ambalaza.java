package d_19_01_2023;

//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu

public abstract class Ambalaza {
    private String barkod;
    private String naziv;
    private double netoTezina;
    private double brutoTezina;

    //konstuktore (default-ni i sa parametrima)
    public Ambalaza(){
    }

    public Ambalaza(String barkod, String naziv, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }
    //gettere i settere
    public String getBarkod() {
        return barkod;
    }
    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getNetoTezina() {
        return netoTezina;
    }
    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }
    public double getBrutoTezina() {
        return brutoTezina;
    }
    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    //metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    public double tezinaPakovanja(){
        double tezinaPakovanja = 0;
        tezinaPakovanja = this.brutoTezina - this.netoTezina;
        return tezinaPakovanja;
    }
    //abstraktnu metodu koja vraca cenu artikla
    public abstract double cenaArtikla();

    //abstraktnu metodu stampaj
    public abstract void stampaj();
}
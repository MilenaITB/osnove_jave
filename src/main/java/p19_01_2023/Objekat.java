package p19_01_2023;
// Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi.
// NE NAZIVAJTE KLASU OBJECT !!
//adresa (ulica i broj)
//povrsina objekta
//zona (1, 2 ili 3)

//metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza
// u zavisnosti u kojoj zoni se nalazi objekat
//zona 1, koeficijent je 1.4
//zona 2, koeficijent je 1.1
//zona 3, koeficijent je 1.05
//abstraktnu metodu koja racuna i vraca porez objekta
//abstraktnu metodu stampaj
public abstract class Objekat {
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public double getPovrsina() {
        return povrsina;
    }
    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }
    public int getZona() {
        return zona;
    }
    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent() {
        if (zona == 1) {
            return 1.4;
        } else if(zona ==2) {
            return 1.1;
        } else {
            return 1.05;
        }
    }

    public abstract double racunajPorez();
    public abstract void stampaj();


}
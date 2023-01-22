package v_19_01_2023;

//(10 poena)
// Kreirati klasu Planina koja od privatnih atributa ima:
//ime planine
//naziv države u kojoj se nalazi
//visinu planine.

public class Planina {
    private String ime;
    private String nazivDrzave;
    private double visina;

    //a od javnih metoda:
    //default-ni konstruktor
    public Planina(){
    }
//    i konstuktor koji postavlja sve parametre
    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }

    //gettere i settere za sve atribute
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getNazivDrzave() {
        return nazivDrzave;
    }
    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }
    public double getVisina() {
        return visina;
    }
    public void setVisina(double visina) {
        this.visina = visina;
    }
}
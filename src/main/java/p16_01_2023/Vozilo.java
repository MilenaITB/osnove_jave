package p16_01_2023;
// klasa koja nam čuva zajedničke stvari iz klase auto i kamion
public class Vozilo {
    protected String registracija; // protected MODIFIKATOR omogućava da pristupimo nečemu
    // iz osnovne klase u izvedenoj klasi i odmah ih postavljamo.
    // NE moraju svi atributi da budu protected iz OSNOVNE klase.
    // one ATRIBUTE koje želimo da dozvolimo PRISTUP u IZVEDENIM klasama,
    // mi kažemo ti atributi su protected i samo oni objekti izvedenih klasa mogu da pristupe tim atributima
    protected String marka;
    protected int brzina;
    protected int kubikaza;
    protected int maxBrzina;

    public Vozilo() {    // konstruktor zadužen da zauzme memoriju za svoje podatke
        System.out.println("Konstuktor iz Vozilo klase.");
    }
// konstruktor koji prima parametre
    public Vozilo(String registracija, String marka,         // taj konstruktor postoji samo u Class-i Vozilo
                  int brzina, int kubikaza, int maxBrzina) {
        this.registracija = registracija;
        this.marka = marka;
        this.brzina = brzina;
        this.kubikaza = kubikaza;
        this.maxBrzina = maxBrzina;
    }
//  METODE i getere i setere kada kreiramo u osnovnoj klasi oni se nasleđuju i u izvedenim klasama.
//  ZAJEDNIČKI geteri i seteri idu u osnovnoj klasi
    public String getRegistracija() {
        return registracija;
    }
    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public int getBrzina() {
        return brzina;
    }
    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }
    public int getKubikaza() {
        return kubikaza;
    }
    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }
    public int getMaxBrzina() {
        return maxBrzina;
    }
    public void setMaxBrzina(int maxBrzina) {
        this.maxBrzina = maxBrzina;
    }
    public void stampajBasic() {    // radi samo ovde
        System.out.println("Registracija: " + this.registracija);
        System.out.println("Brzina: " + this.brzina);
        System.out.println("Marka " + this.marka);
        System.out.println("Kubikaza " + this.kubikaza);
    }
}
package v_19_01_2023;
///(20 poena)
// Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
// Klasa sadrži atribut koji pamti koliko poena
// je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati.

public class Alpinista extends Planinar {
    private int poeni;

    // konstruktor
    public Alpinista(int ID, String imeIPrezime, int poeni) {
        super(ID, imeIPrezime);
        this.poeni = poeni;
    }
    // geteri i seteri
    public int getPoeni() {
        return poeni;
    }
    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

// Alpinista može da savlada sve uspone do 4000 metara,

    @Override
    public boolean uspesanUspon(Planina p) {
        if (p.getVisina() <= 4000){
            return true;
        } else
            return false;
    }

    // placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
// a informacije o alpinisti se ispisuju u formatu:
    @Override
    public double clanarina() {
        double clanarina = 1500-(this.poeni*50);
        return clanarina;
    }

    //Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
    @Override
    public void stampaj() {
        System.out.println("Alpinista, ID:"+this.ID);
        System.out.println("Ime i prezime: "+this.imeIPrezime);
        System.out.println("Broj poena: "+this.poeni);
    }
}
package v_19_01_2023;

//(20 poena)
// Kreirati klasu RekreativniPlanina
// koja nasleđuje klasu Planinar.
// Klasa dodatno pamti još neke informacije koje
// se ne mogu menjati nakon postavljanja u konstuktoru:
//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//naziv okruga odakle je rekreativni planinar.
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    // konstruktor
    public RekreativniPlaninar(int ID, String imeIPrezime, int tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(ID, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }
  // geteri i seteri
    public int getTezinaOpreme() {
        return tezinaOpreme;
    }
    public String getNazivOkruga() {
        return nazivOkruga;
    }
    public double getMaxUspon() {
        return maxUspon;
    }


//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
    @Override
    public void stampaj() {

    }
    //rekeativci placaju clanarinu u iznosu od 1000 rsd
    @Override
    public double clanarina() {
        return 0;
    }

    //da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći
    // uspon manji od visine planine, s tim da oprema dodatno otežava penjanje
    // i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    @Override
    public boolean uspesanUspon(Planina p) {
        return false;
    }
}
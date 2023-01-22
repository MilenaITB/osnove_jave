package p19_01_2023;

public class Kamion extends Vozilo {

    private int nosivost;

    public Kamion() {
        super(); // ovo je poziv konstuktora iz osnovne klase

    }

    @Override
    public void stampaj() {
        System.out.println("KAMION");
    }

    @Override
    public void dodajGas() {
        this.brzina = this.brzina + 5;
    }

    public Kamion(String registracija, String marka, int brzina,
                  int maxBrzina, int kubikaza, int nosivost) {
        super(registracija, marka, brzina, kubikaza, maxBrzina);

        this.nosivost= nosivost;
    }

}
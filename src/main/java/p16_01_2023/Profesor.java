package p16_01_2023;
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
public class Profesor extends Osoba{
    private String predmet;
    private double plata;
    public Profesor(String imeIPrezime, String jmbg, String predmet, double plata) {
        super(imeIPrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }
    public void povecajPlatu(int procenat) {
        this.plata = this.plata * (1 + procenat/100.0);
    }
    @Override
    public void stampaj() {
        System.out.println("Profesor");
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }


}
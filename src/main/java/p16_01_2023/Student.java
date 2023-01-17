package p16_01_2023;
//Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
// Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//

public class Student extends Osoba {

    private String index;
    private double dug;

    public Student(String imeIPrezime, String jmbg, String index, double dug) {
        super(imeIPrezime, jmbg);
        this.index = index;
        this.dug = dug;
    }


    public void uplatiSkolarinu(double iznos) {
        this.dug = this.dug - iznos;
    }
    @Override
    public void stampaj() {
        System.out.println("Student: ");
        super.stampaj();
        System.out.println("Dug: " + this.dug);
        System.out.println("Index: " + this.index);
    }
}
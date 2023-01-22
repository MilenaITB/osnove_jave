package p19_01_2023;

//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//broj stanova
//konstuktore, gettere i setter
//porez racuna po formuli koeficijent * povrsina * broj stanova
//prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

public class Zgrada extends Objekat {
    private int brojStanova;

    public Zgrada() {
        super();
    }

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * this.koeficijent() * this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa + ", ");
        System.out.print(this.povrsina + ", ");
        System.out.print(this.zona + ", ");
        System.out.println(this.brojStanova);
    }
}

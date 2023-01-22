package p19_01_2023;

//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//  Local < Objekat < Object
public class Lokal extends Objekat {

    public Lokal() {
        super();
    }

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }


    @Override
    public double racunajPorez() {
        return this.povrsina * koeficijent() * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa + ", ");
        System.out.print(this.povrsina + ", ");
        System.out.print(this.zona + ", ");
    }
}

package p19_01_2023;

public abstract class Atleticar {
    protected String punoIme;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }
    public String getPunoIme() {
        return punoIme;
    }
    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public double getRezultat() {
        return rezultat;
    }
    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeBolji(Atleticar a);
//	this -> a
//	trkac.daLiJeBolji(trkac2)
//	string1.equals(string2)

    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.rezultat);
    }


}
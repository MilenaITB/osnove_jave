package p19_01_2023;

public class Trkac extends Atleticar {

    public Trkac() {
    }

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if (this.rezultat < a.rezultat) {
            return true;
        } else {
            return false;
        }
    }

}
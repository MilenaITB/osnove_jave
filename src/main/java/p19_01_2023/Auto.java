package p19_01_2023;

public class Auto extends Vozilo {
    private int brojSedista;
    public Auto() {

    }

    @Override
    public void stampaj() {
        System.out.println("AUTO");
    }
    @Override
    public void dodajGas() {
        this.brzina = this.brzina + 15;
    }


}
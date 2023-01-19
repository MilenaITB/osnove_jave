package d_16_01_2023;

//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
public class Trener extends Osoba{
    private int godIskustva;
    private String tipTrenera;

    public Trener(){    // defoltni konstruktor
    }
   // konstruktor sa svim parametrima
    public Trener(String imeIPrezime, String jmbg, String godRodj, int godIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godRodj);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }
    // geteri i seteri
    public int getGodIskustva() {
        return godIskustva;
    }
    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }
    public String getTipTrenera() {
        return tipTrenera;
    }
    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    //  metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
    public void stampaj(){
        System.out.println("Trener: ");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godIskustva + "\n" + "Tip trenera: " + this.tipTrenera);
    }
}

package v_16_01_2023;

//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//
public class Trener extends Osoba{
    private int godineIskustva;
    private String tip;

    public Trener(String imeIPrezime, String jmbg, int godinaRodj, int godineIskustva, String tip) {
        super(imeIPrezime, jmbg, godinaRodj);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void stampajTrenera(){
        System.out.println("Trener:");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tip);
    }
}
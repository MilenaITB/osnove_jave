package d_16_01_2023;


//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)



public class Igrac extends Osoba{
    private int brIgraca;
    private String pozijaIgraca;
    private boolean kapiten;

    //default-ni konstuktor
    public Igrac(){
    }
    //        konstuktor sa parametrima
    public Igrac(String imeIPrezime, String jmbg, String godRodj, int brIgraca,
                 String pozijaIgraca, boolean kapiten) {
        super(imeIPrezime, jmbg, godRodj);
        this.brIgraca = brIgraca;
        this.pozijaIgraca = pozijaIgraca;
        this.kapiten = kapiten;
    }
    //        gettere i settere za broj, kapiten i poziciju
    public int getBrIgraca() {
        return brIgraca;
    }
    public void setBrIgraca(int brIgraca) {
        this.brIgraca = brIgraca;
    }
    public String getPozijaIgraca() {
        return pozijaIgraca;
    }
    public void setPozijaIgraca(String pozijaIgraca) {
        this.pozijaIgraca = pozijaIgraca;
    }
    public boolean isKapiten() {
        return kapiten;
    }
    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    //        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    @Override
    public void stampaj() {
        System.out.println("Igrač: ");
        super.stampaj();
        System.out.println("Broj koji igrac nosi: " + this.brIgraca  + "\n" + "Poziciju koju igra" + " " +
                "Kapiten: " + this.isKapiten());
    }
}


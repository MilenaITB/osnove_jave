package v_16_01_2023;

import java.util.ArrayList;

//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)

public class Igrac extends Osoba{
    private int brojDresa;
    private String pozicija;
    private boolean jeKapiten;
    private ArrayList<Karton> kartoni;

    public Igrac(){

    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodj, int brojDresa,
                 String pozicija, boolean jeKapiten) {

        super(imeIPrezime, jmbg, godinaRodj);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;

        this.kartoni = new ArrayList<>();
    }
    public int getBrojDresa() {
        return brojDresa;
    }
    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }
    public String getPozicija() {
        return pozicija;
    }
    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    public boolean isJeKapiten() {
        return jeKapiten;
    }
    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }
    private int brojZutih(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getKarton().equals("zuti"))
            {
                counter++;
            }
        }
        return counter;
    }
    private int brojCrvenih(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getKarton().equals("crveni")){
                counter++;
            }
        }
        return counter;
    }
    public void stampajIgraca(){
        System.out.println("Igrac:");
        super.stampaj();
        System.out.println("Dres: " + this.brojDresa);
        if(this.jeKapiten){
            System.out.println("Kapiten je");
        }
        else{
            System.out.println("Nije kapiten");
        }
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Broj zutih kartona: " + this.brojZutih());
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih());
    }
}
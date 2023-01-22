package v_19_01_2023;

import java.util.ArrayList;

//(25 poena)
// Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//naziv doma
//godinu kada je osnovan.

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaosnivanja;
    //članove doma koji su planinari (klasa vodi računa o nizu)
    private ArrayList<Planinar>listaPlaninara;

    //Dok od javnih:
//default-ni konstuktor i konstuktor koji postavlja sve parametre

    public PlaninarskiDom(){
    }

    public PlaninarskiDom(String nazivDoma, int godinaosnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaosnivanja = godinaosnivanja;
        this.listaPlaninara = new ArrayList<>();
    }

    //gettere i settere koji su potrebni
    public String getNazivDoma() {
        return nazivDoma;
    }
    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }
    public int getGodinaosnivanja() {
        return godinaosnivanja;
    }
    public void setGodinaosnivanja(int godinaosnivanja) {
        this.godinaosnivanja = godinaosnivanja;
    }
    public ArrayList<Planinar> getListaPlaninara() {
        return listaPlaninara;
    }
    public void setListaPlaninara(ArrayList<Planinar> listaPlaninara) {
        this.listaPlaninara = listaPlaninara;
    }

    //metodu učlani planinara, koja dodaje planinara u niz
    public void uclaniPlaninara(Planinar p){
        this.listaPlaninara.add(p);
    }

    //metodu koja vraća broj planinara koji će se uspešno popeti na planinu
    // (metoda za parametar prima Planinu za koju se proverava informacija)
        public int brojUspesnihUspona(Planina planina){
        int counterUspesniHUspona = 0;
        for (int i = 0; i < listaPlaninara.size(); i++) {
            if(listaPlaninara.get(i).uspesanUspon(planina)){
                counterUspesniHUspona++;
            }
        } return counterUspesniHUspona;
    }

    //metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
    public void izbaciPlaninara(int ID){
        for (int i = 0; i < listaPlaninara.size(); i++) {
            if(listaPlaninara.get(i).getID()==ID){
                listaPlaninara.remove(i);
            }
        }
    }

    //metodu koja štampa podatke o domu i o svim članovima doma

    public void stampaj(){
        System.out.println("Planinarski dom: "+ this.nazivDoma + ". Osnovan je "+this.godinaosnivanja + " godine.");
        for (int i = 0; i < listaPlaninara.size(); i++) {
            listaPlaninara.get(i).stampaj();
        }
    }
    //metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
    public double mesecniPrihod(){
        double sumaClanarina=0.0;
        for (int i = 0; i < listaPlaninara.size(); i++) {
            sumaClanarina = sumaClanarina+listaPlaninara.get(i).clanarina();
        } return sumaClanarina;
    }
}
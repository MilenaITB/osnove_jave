package p19_01_2023;

//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal

import java.util.ArrayList;

public class PolimorfizamUvod {
    public static void main(String[] args) {
        Kamion k = new Kamion();
        k.setBrzina(10);
        k.setKubikaza(2000);
        k.setRegistracija("NI-3232-23");
        k.setMaxBrzina(120);
        k.setMarka("BMW");

        Auto a = new Auto();
        a.setRegistracija("NI-032923-23");
        a.setBrzina(100);
        a.setKubikaza(120);
        a.setMarka("Audi");
        a.setMaxBrzina(240);
        a.novaMetoda();


        ArrayList<Kamion> kamioni = new ArrayList<Kamion>();
        ArrayList<Auto> automobili = new ArrayList<Auto>();

        kamioni.add(k);
        automobili.add(a);
        ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();
        vozila.add(k);
        vozila.add(a);
        for (int i = 0; i < vozila.size(); i++) {
            vozila.get(i).stampaj();
        }
//        [kamion, auto, auto, kamion, auto, kamio ...]

    }


}
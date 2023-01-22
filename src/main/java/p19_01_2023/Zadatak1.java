package p19_01_2023;

// Zadatak
//U glavnoj klasi kreirati niz od 5 figura
// (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime
// i za svaku figuru ispisati ponaosob

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Figura trougao1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(6);
        JednakostranicniTrougao trougao3 = new JednakostranicniTrougao(7);
        Pravougaonik pravougaonik1 = new Pravougaonik(5, 15);
        Pravougaonik pravougaonik2 = new Pravougaonik(5, 20);

        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(trougao1);
        figure.add(trougao2);
        figure.add(trougao3);
        figure.add(pravougaonik1);
        figure.add(pravougaonik2);

        double obim = 0;
        double povrsina = 0;

        for (int i = 0; i < figure.size(); i++) {
            obim = obim + figure.get(i).obim();
        }

        for (int i = 0; i < figure.size(); i++) {
            povrsina = povrsina + figure.get(i).povrsina();
        }

        System.out.println("Suma obima: " + obim);
        System.out.println("Suma provrsina: " + povrsina);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }







    }
}

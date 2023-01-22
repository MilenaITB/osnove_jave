package p19_01_2023;
// Zadatak
//U glavnoj klasi kreirati niz od 5 figura
// (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime
// i za svaku figuru ispisati ponaosob

import java.util.ArrayList;

public abstract class Figura {


        public abstract double povrsina();
        public abstract double obim();

        public void stampaj() {
            System.out.println("Provrsina: " + this.povrsina());
            System.out.println("Obim: " + this.obim());
        }
    }


package p17_01_2023;
// 3. Zadatak
//Kreirati abstraktnu klasu Figura koja ima
//abstraktnu metodu povrsina
//abstraktnu metodu obim
//metodu koja stampa podatke u formatu:
//Povrsina je (povrsina)
//Obim je (obim)
//
//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//stranicu a
//gettere/settere/konstruktore
//implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//implementira metodu obim
//
//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//stranice a i b
//gettere/settere/konstruktore
//implementira metodu povrsina
//implementira metodu obim

public class Zadatak3 {

        public static void main(String[] args) {
            JednakostranicniTrougao trougao = new JednakostranicniTrougao(5);
            Pravougaonik pravougaonik = new Pravougaonik(5, 10);

            trougao.stampaj();
            pravougaonik.stampaj();
        }
    }


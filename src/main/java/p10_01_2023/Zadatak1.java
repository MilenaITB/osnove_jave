package p10_01_2023;
// 1.Zad
//Za klasu Tacka, koja ima privatne atribute:
//x - x koordinata
//y - y koordinata
//Javne metode:
//metodu stampaj
//imamo difoltni konstruktor
//imamo konstuktor koji prima obe koordinate za kreiranje objekta
//geter za x
//geter za y
//seter za x
//seter za y
//
//U glavnom programu kreirati dva objekta:
//Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40
public class Zadatak1 {
    public static void main(String[] args) {
        Tacka m = new Tacka();
//        m.pomeriPoX(14);
//        m.stampaj();
//        m.pomeriPoX(-4);
//        m.stampaj();

        Tacka n = new Tacka(30, 40);
        n.stampaj();

    }
}


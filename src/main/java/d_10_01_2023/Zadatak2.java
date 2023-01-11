package d_10_01_2023;

public class Zadatak2 {

    public static void main(String[] args) {
        ClanskaKarta kartica = new ClanskaKarta(10, "9329-0239");
        Kupac kupac = new Kupac("Vladimir Minic", kartica);
        Proizvod p1 = new Proizvod("The Gurkha Black Dragon", kupac, 1150);
        p1.stampaj();

    }
}





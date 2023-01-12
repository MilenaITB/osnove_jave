package p10_01_2023;



//2.Zad Kreirati klasu Radnik koja ima:
//jmbg radnika
//ime i prezime
//broj dece (1,2,3,... ili 0 ako nema dece)
//stepen strucne spreme (od 1 do 8)
//godine radnog staza
//konstuktor koji postavlja samo jmbg
//konstuktor koji postavlja sve atribute
//getere i setere
//metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//metodu koja vraca koeficijent slozenosti:
//Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.
//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//metodu koja vraca da li je zaposleni kreditno sposoban.
// (Kreditno je sposoban ako je plata veca od 50 000)
//
//
//
//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1

public class Zadatak2 {
    public static void main(String[] args) {
        Radnik r = new Radnik("23903209233");
        Radnik m = new Radnik(
                "34943934943",
                "Milan Jovanovic",
                4,
                5,
                10);


        r.setBrojDece(2);
        r.setImeIPrezime("Pera Peric");
        r.setRadniStaz(10);
        r.setSss(7);


        r.stampaj();
        m.stampaj();


    }
}
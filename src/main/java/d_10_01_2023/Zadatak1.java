package d_10_01_2023;


//   Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)




//
//	U glavnom programu napraviti vise autora sa vise knjiga.

public class Zadatak1 {
    public static void main(String[] args) {

        Autor a1 = new Autor("Vladimir", "Minic");
        Knjiga jedaj = new Knjiga("12345", "Memoari jednog Džedaja", 2022, a1);
        jedaj.stampaj();

        System.out.println("**************************");

        Autor a2 = new Autor();
        a2.setIme("Milan");
        a2.setPrezime("Jovanovic");

        Knjiga guru = new Knjiga("678910");
        guru.setNaziv("Još jednu generaciju izvedoh na put");
        guru.setGodinaIzdanja(2023);
        guru.setAutor(a2);

        guru.stampaj();
    }
}



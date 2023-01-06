package d_29_12_2022;

public class Zadatak1 {


//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju
// treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a
// povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
// Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
// Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        public static void main(String[] args) {

            Proizvod cipele = new Proizvod();

            cipele.setNaziv("MilenikaShoes");
            cipele.setCena(150);
            cipele.setTezinaGr(250);

            cipele.stampaj();
            cipele.povecajCenu(20);
            cipele.vratiCenuSaPopustom(25.5);

            cipele.racunajPostarinu();

            System.out.println("Cena sa popustom je: " + cipele.vratiCenuSaPopustom(30) + " €");
            System.out.println("Postarina je: " + cipele.racunajPostarinu() + " RSD");

            Proizvod cepin = new Proizvod();
            cepin.setNaziv("Cepin");
            cepin.setCena(80);
            cepin.setTezinaGr(500);

            System.out.println();

            cepin.stampaj();
            cepin.povecajCenu(10);
            cepin.vratiCenuSaPopustom(15);
            cepin.racunajPostarinu();

            System.out.println("Cena sa popustom je: " + cepin.vratiCenuSaPopustom(12));
            System.out.println("Postarina je: " + cepin.racunajPostarinu() + "RSD");

            }
        }
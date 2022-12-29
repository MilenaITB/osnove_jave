package d_27_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone.
//        Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
//        Jedinica moze biti “kg” ili “t”

//        Scanner s = new Scanner(System.in);


        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Computer";
        proizvod1.cena = 1200;
        proizvod1.tezinaGram = 2500;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "TV";
        proizvod2.cena = 2800;
        proizvod2.tezinaGram = 3500;

        proizvod1.stampaj();
        System.out.println("Tezina u kg: " + proizvod1.konvertuj("kg"));
        proizvod2.stampaj();
        System.out.println("Tezina u t: " + proizvod2.konvertuj("t"));

    }
}

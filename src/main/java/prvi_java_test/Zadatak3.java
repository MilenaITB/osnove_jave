package prvi_java_test;

//       //        Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
////        je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
////        7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
////        Program na kraju ispisuje da li je dobitna kombinacija.
////        Primer izvrsenja programa:
////        Ako se unesu nizovi:
////        ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
////        ● Program stampa “Nije dobitna kombinacija”
////        Ako se unesu nizovu za:
////        ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} .
////        ● Program stampa “Jeste dobitna kombinacija”
//
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> odigrani = new ArrayList<Integer>();
        ArrayList<Integer> izvuceni = new ArrayList<Integer>();


        for (int i = 0; i < 7; i++) {
            System.out.print("Odigrajte broj: ");
            int odigraniBroj = s.nextInt();
            odigrani.add(odigraniBroj);

        } for (int i = 0; i < 7; i++) {
            System.out.print("Izvuceni broj: ");
            int izvuceniBroj = s.nextInt();
            izvuceni.add(izvuceniBroj);
        }
                int counter = 0;
        for (int i = 0; i < 7; i++) {
            if (odigrani.get(i) == izvuceni.get(i)){
                counter++;
            }
        } if (counter == 7){
            System.out.print("Jeste dobitna kombinacija!");
        } else {
            System.out.print("Nije dobitna kombinacija.");
        }
    }
}
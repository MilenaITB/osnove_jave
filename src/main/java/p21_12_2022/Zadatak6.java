package p21_12_2022;

import java.util.ArrayList;
// 6.Zadatak
//Napisati progam koji stampa niz u obrnutom redosledu tj.
// od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(3); // 0
        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(43); // 4


        for (int i = brojevi.size() - 1; i >= 0 ; i--) {
            System.out.print(brojevi.get(i) + ", ");
        }


    }
}

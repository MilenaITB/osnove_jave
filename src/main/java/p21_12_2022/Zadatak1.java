package p21_12_2022;

import java.util.ArrayList;


        //1.Zadatak
        //Napisati program koji u sebi ima definisan niz od 5 broja
        // (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.
public class Zadatak1 {
    public static void main(String[] args) {


//        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//
//        brojevi.add(1);
//        brojevi.add(2);
//        brojevi.add(3);
//        brojevi.add(4);
//        brojevi.add(5);
//
//        int suma = brojevi.get(0) + brojevi.get(4);
//
//        System.out.println("Suma " + suma);



      ArrayList<Integer> brojevi = new ArrayList<Integer>();
       brojevi.add(43);
       brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(3);

////    5 => 0,1,2,3,4
////        3 => 0,1,2
////        9 => 0,1,2,3,4,5,6,7,8
////        int lastIndex = brojevi.size() - 1;
//
       int suma = brojevi.get(0) + brojevi.get(brojevi.size() - 1);

       System.out.println("Suma " + suma);




    }
}
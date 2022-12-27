package p26_12_2022;


// 8. Zadatak
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

//public class Zadatak8 {
//    public static void main(String[] args) {
//
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        boolean pravougli = daLiJeTrougaoPravougli(a, b, c);
//        System.out.println("Trougao je pravougli " + pravougli);
//
//        }
//
//    public static boolean daLiJeTrougaoPravougli(int a, int b, int c) {
//       if ((a*a) + (b*b) == c*c){
//           return true;
//       } else {
//           return false;
//       }
//
//    }
//    }              MOJ ZADATAK SA ČASA

//  MILANOVO REŠENJE


public class Zadatak8 {
    public static void main(String[] args) {
//        boolean trougao = jePravougli(3,4,6);
        if (jePravougli(3,4,6)) {
            System.out.println("Jeste pravougli.");
        } else {
            System.out.println("Nije pravougli.");
        }

    }

    public static boolean jePravougli(int a, int b, int c) {
//        if (a * a + b * b == c * c) {
//            return true;
//        } else {
//            return false;
//        }

        if (a * a + b * b == c * c) {
            return true;
        }
        return false;
    }

}





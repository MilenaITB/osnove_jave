package p26_12_2022;


// 5. Zadatak
//Napisati metodu stampaj ApsolutnuVrednost, koja stampa apsolutnu vrednost
// prosledjene vrednosti.

//import java.util.Scanner;
//
//public class Zadatak5 {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Unesite broj a: ");
//        int a = s.nextInt();
//
//
//        stampajApsolutnuVrednost(a);
//
//        }
//
//    public static void stampajApsolutnuVrednost(int a) {
//        System.out.print("Apsolutnu vrednost prosledjene vrednosti  "
//                + Math.abs(a));
//
//    }
//    }
//                 MOJE SA ČASA

//     MILAN REŠENJE:

public class Zadatak5 {
    public static void main(String[] args) {
        int x = 10, y = 2;
        apsolutnaVrednost(10);
        apsolutnaVrednost(x - 49);
    }

    public static void apsolutnaVrednost(int a) {
        if (a < 0) {
            System.out.println("Apsolutna je " + -a);
        } else {
            System.out.println("Apsolutna je " + a);
        }
    }

}





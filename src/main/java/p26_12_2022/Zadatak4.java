package p26_12_2022;


// 4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
// Brojevi su ulazni parametri funkcije.
// U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

//import java.util.Scanner;
//
//public class Zadatak4 {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Unesite broj a: ");
//        int a = s.nextInt();
//
//        System.out.println("Unesite broj b:");
//        int b = s.nextInt();
//
//        kalkulator( a, b);
//
//        }
//
//    public static void kalkulator(int a, int b) {
//        System.out.println("a + b = " + (a+b));
//        System.out.println("a - b = " + (a-b));
//        System.out.println("a - b = " + (a*b));
//        System.out.println("a - b = " + (a/b));
//
//                      MOJE REŠAVANJE NA ČASU
//    }
//    }
//          MILAN:

public class Zadatak4 {
    public static void main(String[] args) {
        int x = 10, y = 2;

        matematika(10, 5);

        matematika(x, y);

        matematika(x + 1, y - 1);
    }

    public static void matematika(int a, int b) {
        System.out.println("Zbir: " + (a + b));
        System.out.println("Razlika: " + (a - b));
        System.out.println("Kolicnik: " + (a / b));
        System.out.println("Proizvod: " + (a * b));
    }

}




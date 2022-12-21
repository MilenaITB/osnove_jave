package p20_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {



        //   7.   Napisati program koji sabira brojeve koje korisnik unosi,
        //   pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.

        //   1. REŠENJE JE LOŠE REŠENJE

        Scanner s = new Scanner(System.in);

        int suma = 0;

        System.out.println("Unesite vrednost:");
        int vrednost = s.nextInt();


        while( suma + vrednost <= 100) {
            suma = suma + vrednost;

            System.out.println("Unesite vrednost:");
            vrednost = s.nextInt();

        }

        System.out.println("Suma je " + suma);

    }
}

//     package p20_12_2022;
//
//import java.util.Scanner;
//       II REŠENJE BACKUP
//public class Zadatak7_2 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int suma = 0;
//        int backupSuma = 0;
//
//        while(suma <= 100) {
//            System.out.println("Unesite vrednost:");
//            int vrednost = s.nextInt();
////            backupSuma = suma;
//            suma = suma + vrednost;
////            if (suma > 100) {
////                backupSuma = suma - vrednost;
////            }
//        }
//
//        System.out.println("Suma je " + backupSuma);
//
//    }
//}


//     NAJUNIVERZALNIJE REŠENJE JER MOGU DA GA KORISTIM ZA BILO KOJI TOK U PETLJI
//      package p20_12_2022;
//
//import java.util.Scanner;
//
//public class Zadatak7_3 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int suma = 0;
//        boolean running = true;
////        boolean gameOver = false;
//
//        while(running) {
//            System.out.println("Unesite vrednost:");
//            int vrednost = s.nextInt();
//            if (suma + vrednost > 100) {
//                running = false;
//            } else {
//                suma = suma + vrednost;
//            }
//        }
//
//        System.out.println("Suma je " + suma);
//
//    }
//}
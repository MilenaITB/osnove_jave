package prvi_java_test;

import java.util.Scanner;

public class Zadatak2 {

//        Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//        zaredom.Na kraju programa ispisati sumu unetih brojeva.

//        Primer izvršenja 1:
//        Unesite broj: 1
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 5
//        Unesite broj: 9
//        Unesite broj: 0
//        Unesite broj: 0
//        Suma je 19


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojac = 0;
        int suma = 0;

        while (brojac < 2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 0) {
                brojac++;
            } else {
                brojac = 0;
            }   suma = suma + broj;
        }
        System.out.print("Suma je " + suma);
    }

}


//        int brojac = 0;
//        int suma = 0;
//
//        while(brojac != 2){
//            System.out.println("Unesite broj: ");
//            int x = s.nextInt();
//            suma = suma + x;

//            if (x == 0){
//                brojac++;
//            } else{
//                brojac = 0;
//            }
//        }
//        System.out.println("Suma je " + suma);
//
//    }
//}
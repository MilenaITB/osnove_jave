package d_14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.    Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
        // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

       Scanner s = new Scanner(System.in);
      System.out.println("Unesite x za T1: ");
       int xT1 = s.nextInt();

       System.out.println("Unesite y za T1: ");
        int yT1 = s.nextInt();

        System.out.println("Unesite x za T2: ");
        int xT2 = s.nextInt();

        System.out.println("Unesite y za T2: ");
        int yT2 = s.nextInt();

        System.out.println("Unesite x za M: ");
        int xM = s.nextInt();

       System.out.println("Unesite y za M: ");
        int yM = s.nextInt();



        if ((xT1 < xM && xM < xT2 || xT2 < xM && xM < xT1) && (yT1 < yM && yM < yT2 || yT2 < yM && yM < yT1)) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto unutar forme");
        }
    }
}

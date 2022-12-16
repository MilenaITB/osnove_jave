package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite pocetnu jacinu zvuka:");
        int zvuk = s.nextInt();
        System.out.println("Unesite akciju:");
        String akcija = s.next();

        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute")) {
            zvuk = 0;
        }

//        if (zvuk < 0) {
//            zvuk = 0;
//        } else if (zvuk > 100) {
//            zvuk = 100;
//        }

        System.out.println("Nova jacina zvuka je " + zvuk);

    }
}






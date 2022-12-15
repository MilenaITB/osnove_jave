package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

//Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
//Korisnik unosi akciju sa tastature. Jednu od sledecih:
//pojacaj - pojacava zvuka za 10
//smanji - smanjuje zvuk za 10.
//mute - postavlja zvuk na 0.
//Na kraju programa odstampati jacinu zvuka
//Primer izvrsenja 1:
//Jacina zvuka je 75.
//Unesite akciju: pojacaj
//Nova jacina zvuka je 85

//        int zvuk = 75;
//
        Scanner s = new Scanner(System.in);
//
//        System.out.println("Unesite akciju:");
//        String akcija = s.next();
//
//        if (akcija.equals("pojacaj")) {
//            System.out.println("Nova jacina zvuka je 85");
//        } else if (akcija.equals("smanji")) {
//            System.out.println("Nova jacina zvuka je 65");
//        } else if (akcija.equals("mute")) {
//            System.out.println("Nova jacina zvuka je 0");
//
//        }
//    }
//}


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
        System.out.println("Nova jacina zvuka je " + zvuk) ;
   }
}

//    if (zvuk < 0) {
//           zvuk = 0;
//       } else if (zvuk > 100) {
//            zvuk = 100;
//        }
//
//        System.out.println("Nova jacina zvuka je " + zvuk);
//
//    }
//}
package p19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {



//        Napisati program koji sumira brojeve od 1 do 10 i na kraju programa ispisuje sumu.
//        suma = 1 + 2 + 3 + … + 10 (ovo je objasnjenje)
//        Primer izvrsenja:
//        Suma brojeva od 1 do 10 je 55

        int suma = 0;


//        suma = 1 + 2 + 3 + 4 + 5;
//          suma = a + b + c....
        suma = suma + 1;
        suma = suma + 1;
        suma = suma + 1;
        suma = suma + 1;
        suma = suma + 1;
//     isto kao da smo napravili suma = 1 + 1 + 1 + 1 + 1;


//       suma = suma + 1;
//       suma = suma + 2;
//       suma = suma + 3;
//       suma = suma + 4;
//       suma = suma + 5;        .............taj izraz bi zamenili FOR PETLJOM

        for (int i = 1; i <= 5; i++) {
            suma = suma + i;
        }
        System.out.println(suma);



//        int suma = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            suma = suma + i;
//
//        }
//        System.out.println(suma);
    }

    }











package d_20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//      3.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);

                int counter1 = 0;
                int counter2 = 0;
                boolean isRuinning = true;

                while (isRuinning) {
                    System.out.print("Unesite broj: ");
                    int broj = s.nextInt();

                    if(broj == 1) {
                        counter1++;
                    } else if (broj == 2) {
                        counter2++;
                    } if(counter1 >= 3 || counter2 >= 2) {
                        isRuinning = false;
                    }
                }
                System.out.println("Kraj programa.");
            }
        }
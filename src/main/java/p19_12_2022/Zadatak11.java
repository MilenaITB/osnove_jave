package p19_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {



//       Napisati program koji uneti password sakriva.
//Primer izvrsenja:
//Unestite password: OvoJePassword123
//Skriverni password: ****************


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite  password: ");
        String password = s.next();
        int x = password.length();
        String demo = password;

        for (int i = 0; i < x; i++) {

            System.out.print(" *");

        }


        }


             

           }

      //  System.out.println(password.);


















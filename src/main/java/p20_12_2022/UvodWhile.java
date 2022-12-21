package p20_12_2022;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj = -1;

        while (broj != 0) {
            System.out.println("Unesite broj:");

        broj = s.nextInt();

            System.out.println("Unet broj je " + broj);
        }
        System.out.println("Uneta je nula. Kraj");
    }
    }










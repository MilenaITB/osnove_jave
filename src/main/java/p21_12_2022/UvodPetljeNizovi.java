package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class UvodPetljeNizovi {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(8);
        brojevi.add(43);

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");
        }



    }
}
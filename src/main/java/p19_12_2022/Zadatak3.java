package p19_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {



//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
            //Izvrsenje:
            //2 na stepen 7 je 128
            //HINT
            //P = 2 * 2 * 2 * 2 * 2 * 2 * 2
            //P = 1
            //P = P * 2
            //P = P * 2
            //P = P * 2
            //P = P * 2
            //P = P * 2
            //P = P * 2
            //P = P * 2

         int p = 1;

        for (int i = 0; i < 7; i++) {
            p = p * 2;
        }
        System.out.println("Stepen je " + p);
        }

    }

















package d_13_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {

//       4.	 Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//       KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//              Primer izvrsenja programa:
//               a: 10
//               Povrsina je 43.25
//                Obim je 30

        int a = 10;
        int obim = a * 3;
        double povrsina = (a * a * 1.73)/4;

        System.out.println("a: " + a);
        System.out.println("Povrsina je: " + povrsina);
        System.out.println("Obim je: " + obim);


    }
}

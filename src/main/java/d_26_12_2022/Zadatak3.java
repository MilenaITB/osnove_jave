package d_26_12_2022;

public class Zadatak3 {

    //  3.	Napisati funkciju koja za dva jednocifrena broja koja su
    //  ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
    //  METODA NISTA NE STAMPA.
    //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
    //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    public static void main(String[] args) {


        int noviBroj = kombinacija (2,3);
        System.out.println("Broj je: " + noviBroj);
    }
    public static int kombinacija(int a, int b)
    {
        return a * 10 + b;
    }
}







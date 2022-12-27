package p26_12_2022;


// 7.Zadatak
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
// Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

public class Zadatak7 {
    public static void main(String[] args) {
        int z = obrni(-3);
        int s = obrni(5);
        System.out.println(z);
        System.out.println(s);


    }

    public static int obrni(int n) {
        int o = -n;
        return o;
    }

}
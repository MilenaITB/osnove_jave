package d_27_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        //      2.	Kreirati klasu SmartAirConditioning koja ima:
        //•	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //•	atribut za izabranu temperaturu
        //•	atribut za mod (hladi/greje) - string
        //•	metodu za stampu (proizvoljno)
        //•	metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
        // Metoda kao parametar prima temperaturu koja je napolju.
        //
        //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode




        Scanner s = new Scanner(System.in);


        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 25;
        klima1.mod = "Greje";

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Gree";
        klima2.temperatura = 30;
        klima2.mod = "Hladi";

        klima1.print();
        klima2.print();
        System.out.println("Koja je temperatura napolju?");
        int napolju = s.nextInt();
        if (klima1.temperaturaNapolju(napolju)) {
            System.out.println(klima1.marka + ": Temperatura napolju je veca.");
        } else {
            System.out.println(klima1.marka + ": Temperatura napolju nije veca.");
        }
        if (klima2.temperaturaNapolju(napolju)) {
            System.out.println(klima2.marka + ": Temperatura napolju je veca.");
        } else {
            System.out.println(klima2.marka + ": Temperatura napolju nije veca.");
        }

    }
}





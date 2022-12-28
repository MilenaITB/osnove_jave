package d_26_12_2022;

public class Zadatak4 {

    //
    //4.	Zadatak
    //Napisati metodu koja stampa podatke o korisniku u formatu:
    //JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]

    //Metoda prima jmbg, ime, prezime, god rodjenja
    // i da li je aktivan kao parametre metode.
    // Metoda nista ne vraca.

    public static void main(String[] args) {


        stampajPodatke("1234567894529", "Vladimir", "Minic",
                1995, true);


    }
    public static void stampajPodatke(String jmbg, String ime, String prezime, int godRodj, boolean active)
    {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodj);
        System.out.println("Aktivan: " + active);

    }
}


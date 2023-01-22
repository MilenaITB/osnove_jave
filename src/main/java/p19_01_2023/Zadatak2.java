package p19_01_2023;
//Zadatak 4. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//        ime i prezime privatni
//        i rezultat ostvaren na takmičenju koji je zasticen
//        Javne metode klase su:
//        apstratktna metoda koja ispituje da li je rezultat atletičara bolji
//        od rezultata drugog atletičara
//        (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//        metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//        Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
//        Kod trkača je bolji manji rezultat, a kod skakača veći.
//        Kreirati i klasu Disciplina čiji su privatni atributi:
//        ime discipline
//        tip discipline (Trkacka ili Skakacka)
//        niz atletičara koji učestvuju u toj disciplini.
//        U javnom delu klase definisati:
//        konstuktore, gettere i settere
//        konstruktor koji postavlja ime discipline i tip
//        metodu dodaj atleticara u disciplinu
//        metodu diskvalifikuj atleticara iz discipline,
//        za parametar funkcije prima se ime i prezime atleticara

public class Zadatak2 {
    public static void main(String[] args) {

            Disciplina skok = new Disciplina("Skok u dalj", "skakaci");
            Disciplina sprint = new Disciplina("110m s preponama", "trakaci");

            skok.dodajAtleticara(new Skakac("Marko Markovic", 8.9));
            skok.dodajAtleticara(new Skakac("Darko Darkovic", 7.2));
            skok.dodajAtleticara(new Skakac("Zarko Zarkovic", 6.8));

            skok.diskvalifikuj("Marko Markovic");

            skok.stampajPobednika();


            sprint.dodajAtleticara(new Trkac("Nikola Nikolic", 10.1));
            sprint.dodajAtleticara(new Trkac("Usain Bolt", 9.1));
            sprint.dodajAtleticara(new Trkac("Dragan Jankovic", 9.9));
            sprint.diskvalifikuj("Dragan Jankovic");
            sprint.stampajPobednika();


//		String a = "09i340934";
//		String b = "klsdlkew09";
//		a.equals(b);
//
//		public boolean equals(String b)

        }

    }



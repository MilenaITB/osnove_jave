package prvi_java_test._30_12_2022;

public class Zadatak5 {
    public static void main(String[] args) {
 // Zadatak (Metode)
        //Napisati metodu koja radi pakovanje nekog teksta u HTML elemente.
        // Metoda kao parametar prima tekst i tip, a vraca HTML element (String)
        // sa proslednjenim tekstom.
        //Metoda podrzava sledece tipove:
        //bold, metoda pakuje tekst u <b>prosledjen tekst</b>
        //italic, metoda pakuje tekst u <em>proslednjen tekst</em>
        //paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
        //Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj. vraca se nakav kakav je dosao umetodu
        //
        //U glavnom programu koristeci kreiranu metodu napisati porogram koji prikazuje sledeci tekst.
        //<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
        //<p>Naravno samo je falio paragraf</p>


        htmlElement("Milan Jovanovic",  "bold");
        System.out.println(htmlElement( "Milan Jovanovic", "bold"));
        htmlElement("Milan Jovanovic","italic" );
        System.out.println(htmlElement("Milan Jovanovic", "italic"));
        htmlElement("Milan Jovanovic", "paragraf");
        System.out.println(htmlElement("Milan Stojkovic", "paragraf"));
    }
    public static String htmlElement (String text, String tip){
        if (tip.equals("bold")){
            String a = "<b>" + text + "</b>";
            return a;
        } else if (tip.equals("italic")){
            String b = "<em>" + text + "</em>";
            return b;
        } else if (tip.equals("paragraf")){
            String c = "<p>" + text + "</p>";
            return c;
        } else {
            return text;
        }
    }
}

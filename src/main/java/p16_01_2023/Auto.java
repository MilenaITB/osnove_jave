package p16_01_2023;
// isto MORAMO da uradimo i za ovu klasu: klasa AUTO, NASLEĐUJE klasu VOZILO
public class Auto extends Vozilo {
//    private String registracija;
//    private String marka;
//    private int brzina;
//    private int kubikaza;
//    private int maxBrzina;  ..........to su zajednički ATRIBUTI i čuvaju se u OSNOVNOJ classi NE i u IZVEDENOJ
    private int brojSedista;  // // čuva se samo razlika u odnosu na zajedniče stvari

    // konstruktor
//    public Auto(String registracija, String marka, int brzina, int kubikaza, int maxBrzina, int brojSedista) {
//        this.registracija = registracija;
//        this.marka = marka;
//        this.brzina = brzina;
//        this.kubikaza = kubikaza;
//        this.maxBrzina = maxBrzina;
//        this.brojSedista = brojSedista;
//    }
    public Auto() {    // konstruktor
    }

    public void stampaj(){      // metoda štampa
        System.out.println("Auto:");
//        this.stampajBasic();   može da se zove metoda za štampu na OBA načina
//        super.stampajBasic();    i this=kao pokazivač na objekat, tj.na samog sebe i super

//        System.out.println("Registracija: " + this.registracija);
//        System.out.println("Brzina: " + this.brzina);
//        System.out.println("Marka " + this.marka);
//        System.out.println("Kubikaza " + this.kubikaza);

        System.out.println("Nosivost: " + this.brojSedista);
    }


}
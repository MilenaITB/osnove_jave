package p16_01_2023;
// klasa kamion nasleđuje klasu vozilo MORAMO U ZAGLAVLJU KLASE da stavimo KLJUČNU REČ EXTENDS,
// gde extendujemo, dopunjavamo neku OSNOVNU KLASU.
// Iza toga ide NAZIV KLASE koja je OSNOVNA KLASA koju klasa kamion NASLEĐUJE
public class Kamion extends Vozilo{
//    private String registracija;
//    private String marka;
//    private int brzina;
//    private int kubikaza;
//    private int maxBrzina;    ..........to je zajedničko i čuva se u OSNOVNOJ classi NE i u IZVEDENOJ
        private int nosivost;  // čuva se samo razlika u odnosu na zajedniče stvari

       // difoltni konstruktor
        public Kamion(){
            super();  // uglavi se difoltni konstruktor = ovo je poziv konstruktora iz OSNOVNE Class-e
            //čita se: zovi mi difoltni konstruktor super klase
            System.out.println("Konstruktor iz Kamion klase");
        }
        public Kamion(String registracija, String marka, int brzina, // konstruktor
                      int maxBrzina, int kubikaza, int nosivost){    // to su svi atributi potrebni za kamion
            super(registracija, marka, brzina, kubikaza, maxBrzina);
            // čim imamo ovako BEZ parametara
            // to je difoltni konstruktor...zato su ubačeni parametri da bi se pozvao NEdifoltni konstruktor


//        this.registracija = registracija;
//        this.marka = marka;
//        this.brzina = brzina;
//        this.maxBrzina = maxBrzina;
//        this.kubikaza = kubikaza;..............to je sada višak
        this.nosivost = nosivost;
        }

        // metoda za štampu
    public void stampaj(){
        System.out.println("Kamion:");
        this.stampajBasic();
//        System.out.println("Nosivost: " + this.nosivost);
//        System.out.println("Registracija: " + this.registracija);
//        System.out.println("Brzina: " + this.brzina);
//        System.out.println("Marka " + this.marka);
//        System.out.println("Kubikaza " + this.kubikaza);

        System.out.println("Nosivost: " + this.nosivost);
    }

//    public Kamion(String registracija, String marka, int brzina, int kubikaza, int maxBrzina, int nosivost) {
//        this.registracija = registracija;
//        this.marka = marka;
//        this.brzina = brzina;
//        this.kubikaza = kubikaza;
//        this.maxBrzina = maxBrzina;
//        this.nosivost = nosivost;
//    }
}

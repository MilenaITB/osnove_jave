package p16_01_2023;

public class UvodNasledjivanje {
    public static void main(String[] args) {

        Kamion k = new Kamion();  // ovo new Kamion zove difoltni konstruktor iz Class-e Kamion
        //pozovi mi kontruktor klase Kamion, on implicitno zove KONSTRUKTOR svoje OSNOVNE klase
        // i ovo je ugrađeno, o ovome NE MORAM da vodim računa
        k.setBrzina(10);
        k.setKubikaza(2000);
        k.setRegistracija("NI-3232-23");
        k.setMaxBrzina(120);
        k.setMarka("BMW");
        k.stampajBasic();  // METODA MOŽE DA SE ZOVE NAD BILO KOJIM OBJEKTOM
        k.stampaj();    // metoda za štampu-štampa objekat k i postoji samo u klasi kamion

        Auto a = new Auto();   // objekat


//             Kamion k = new Kamion("NI-329-32",
//                "BMW",
//                50,
//                1000,
//                120,
//                2 );
//
////        k.stampaj();
////
//       Auto auto = new Auto();    // objekat
        a.setRegistracija("NI-032923-23");
        a.setBrzina(100);
        a.setKubikaza(120);
        a.setMarka("Audi");
        a.setMaxBrzina(240);
        a.stampajBasic(); // univerzalna je i štampa samo parče automobila,
        // ali ta METODA MOŽE DA SE ZOVE NAD BILO KOJIM OBJEKTOM

        a.stampaj();   // metoda za štampu, štampa objekat auto

 //       public void stampajBasic() {    // radi samo ovde
//            System.out.println("Registracija: " + this.registracija);
//            System.out.println("Brzina: " + this.brzina);
//            System.out.println("Marka " + this.marka);
//            System.out.println("Kubikaza " + this.kubikaza);


//        Kamion k = new Kamion("NI-239-32",
//                "BMW",
//                50,
//                1000,
//                120,
//                2 ) ;
//
//
//        Auto auto = new Auto(
//                "NI-439-43",
//                "Audi",
//                40,
//                200,
//                240, 5);


        }
    }

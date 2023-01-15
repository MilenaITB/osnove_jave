package p12_01_2023;

//metodu za stampu koja stampa u formatu:
//ime i prezime


// Kreirati klasu Korisnik koja ima:
//ime i prezime

//public class Korisnik {
//    private String imeIPrezime;
//
//    private String licenca;
//
//
////     tip licence (basic/pro/premium)
////     konstruktore. Po difoltu korisnik ima basic licencu.
////     public Korisnik(){
////     this.imeIPrezime = null;
////     this.licenca = null;        null vrednosti se postavljaju po difoltu, a zadatak traži basic
////                                      naša basic licenca se postavlja u trenutku kreiranja našeg korisnika.
////                                      sve dok ne uplati njemu je licenca basic
//
////  pravim jedan konstruktor
//        public Korisnik() {
//        this.licenca = "basic";
//    }
////         drugi konstruktor
//    public Korisnik(String imeIPrezime) {
//        this.imeIPrezime = imeIPrezime;
//        this.licenca = "basic";
//    }
//
//
////gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//    public void setImeIPrezime(String imeIPrezime) {
//        this.imeIPrezime = imeIPrezime;
//    }
//
//    public void setLicenca(String licenca) {
//        this.licenca = licenca;
//    }
//
//    public String getImeIPrezime() {
//        return imeIPrezime;
//    }
//
//    public String getLicenca() {
//        return licenca;
//    }
////      metodu pretplati se
////      koja postavlja licencu u zavisnosi od uplacene sume:
////      ako je uplata 100, postavlja licencu na “pro”
////      ako je uplata 150, postavlja licencu na “premium”
////      Metoda kao parametar prima vrednost uplate $100 ili $150
//    public void pretplatiSe(int suma){
//        if (suma == 100){
//            this.licenca = "pro";
//        } else if(suma == 150){
//            this.licenca = "premium";
//        }
//    }
//    //     metodu ponisti pretplatu koja postavlja licencu na basic
//    public void ponistiPretplatu(){
//        this.licenca = "basic";
//    }
//
////    metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
////  ako je basic, vraca 40min
////  ako je pro, vraca 240min
////  ako je  premium, vraca 1440min
//
//    public int maksimalnaDuzinaPoziva(){
//        if(this.licenca.equals("basic")){
//            return 40;
//        }else if(this.licenca.equals("pro")){
//            return 240;
//        } else if (this.licenca.equals("premium")) {
//            return 1440;
//        }
//        return 0;
//    }
//}
//
//
//
public class Korisnik {
    private String imeIPrezime;
    private String licenca;

    public Korisnik() {
        this.licenca = "basic";
    }

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.licenca = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getLicenca() {
        return licenca;
    }

    public void pretplatiSe(int suma) {
        if (suma == 100) {
            this.licenca = "pro";
        } else if (suma == 150) {
            this.licenca = "premium";
        }
    }

    public void ponistiPretplatu() {
        this.licenca = "basic";
    }


    public int maksimalnaDuzinaPoziva() {
        if (this.licenca.equals("basic")) {
            return 40;
        } else if (this.licenca.equals("pro")) {
            return 240;
        } else if (this.licenca.equals("premium")) {
            return 1440;
        }
        return 0;
    }



}

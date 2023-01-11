package d_10_01_2023;

//        Kreirati klasu Kupac koja ima:
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice


public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta kartica;

    public Kupac(String imeIPrezime, ClanskaKarta kartica){
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }

    public void stampaj(){
        System.out.println(imeIPrezime + " - " + kartica.getBrojKartice());
    }
}


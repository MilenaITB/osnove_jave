package v_16_01_2023;

//      (Za vezbanje)
//        2. Zadatak
//        Kreirati klasu Karton koja ima:
//        tip kartona (crveni, zuti)
//        konstuktore za koje mislite da ce vam trebati
//        gettere i settere za karton

public class Karton {
    private String karton;

    public Karton(String karton) {
        this.karton = karton;
    }
    public String getKarton() {
        return karton;
    }
    public void setKarton(String karton) {
        this.karton = karton;
    }
}
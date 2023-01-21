package d_19_01_2023;

//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )

public class SuperKartica {
    private String brojKartice;
    private String imeVlasnika;
    private double popust;

    //konstuktore (default-ni i sa parametrima)
    public SuperKartica(){
    }

    public SuperKartica(String brojKartice, String imeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }

    //gettere i settere
    public String getBrojKartice() {
        return brojKartice;
    }
    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
    public String getImeVlasnika() {
        return imeVlasnika;
    }
    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }
    public double getPopust() {
        return popust;
    }
    public void setPopust(double popust) {
        this.popust = popust;
    }

    //metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
//
    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.imeVlasnika);
    }
}

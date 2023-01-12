package p10_01_2023;
// Kreirati klasu Radnik koja ima:
////jmbg radnika
////ime i prezime
////broj dece (1,2,3,... ili 0 ako nema dece)
////stepen strucne spreme (od 1 do 8)
////godine radnog staza
////konstuktor koji postavlja samo jmbg
////konstuktor koji postavlja sve atribute
////getere i setere

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int sss;
    private int radniStaz;

    public String getJmbg() {
        return jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getSss() {
        return sss;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    public int getRadniStaz() {
        return radniStaz;
    }

    public void setRadniStaz(int radniStaz) {
        this.radniStaz = radniStaz;
    }

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int sss, int radniStaz) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.sss = sss;
        this.radniStaz = radniStaz;
    }


    public void stampaj() {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("SSS: " + this.sss);
        System.out.println("Broj dece " + this.brojDece);
        System.out.println("Radni staz: " + this.radniStaz);
        System.out.println("Jmbg" + this.jmbg);
    }
}
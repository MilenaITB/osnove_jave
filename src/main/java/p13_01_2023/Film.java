package p13_01_2023;

public class Film {
    private String naziv;
    private int godina;
    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public void stampaj() {
        System.out.println(this.naziv);
        System.out.println(this.godina);
    }
}
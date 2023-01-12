package p10_01_2023;

public class FacebookPost {

    private String opis;
    private Korisnik autor;

    public FacebookPost(Korisnik autor, String opis) {
        this.autor = autor;
        this.opis = opis;

    }
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getAutor() {
        return autor;
    }
    public void stampaj() {
        System.out.println("OPIS: " + this.opis);
        this.autor.stampaj();
    }
}
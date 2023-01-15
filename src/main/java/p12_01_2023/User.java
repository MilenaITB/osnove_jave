package p12_01_2023;

public class User {
    private String ime;
    private String prezime;

// geteri i seteri

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    // konstruktor
    public User(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
}


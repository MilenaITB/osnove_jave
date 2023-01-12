package p10_01_2023;

public class User {
    private String ime;
    private String prezime;
    private String email;

    public User() {

    }

    public User(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public User(String ime, int x) {

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
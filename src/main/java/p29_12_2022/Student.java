package p29_12_2022;

// 2. Zadatak
//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge


public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean naBudzetu;

    public String getIme() {
        return this.ime;
    }
    public String getPrezime() {
        return  this.prezime;
    }
    public int getBrojIndeksa() {
        return  this.brojIndeksa;
    }
    public boolean getNaBudzetu() {
        return this.naBudzetu;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setNaBudzetu(boolean naBudzetu) {
        this.naBudzetu = naBudzetu;
    }



    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

}
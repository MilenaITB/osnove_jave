package d_13_01_2023;

import java.util.ArrayList;

//  Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
public class Student {
    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;

    //niz ispita
    private ArrayList<Ispit> ispiti;
    //getter za niz predmeta
    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    //gettere i settere za indeks, ime i prezime, tip studija
    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getTipStudija() {
        return tipStudija;
    }
    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    //konstuktore koje mislite da ce vam trebati
    public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    //metodu dodaj ispit u niz ispita
    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }
    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    public double prosek(){
        double zbir = 0;
        double prosecnaOcena = 0;
        int brojOcena = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                brojOcena++;
                zbir = zbir + this.ispiti.get(i).getOcena();
                prosecnaOcena = zbir / brojOcena;
            }

        }
        return prosecnaOcena;
    }
    //metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)

    public void stampaj(){
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Tip studija: " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getPredmet() + " - " + this.ispiti.get(i).getProfesor() +
                    " - " + this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }
}
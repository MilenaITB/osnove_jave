package d_12_01_2023;

// 1. Zadatak

//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

//Kreirati klasu ZeleniKarton koja ima:
public class ZeleniKarton {
    //ime i prezime studenta
    private String imeIPrezimeStudent;

    //broj indeksa
    private int brojIndeksa;

    //naziv predmeta
    private String predmet;

    //ime i prezime profesora
    private String imeIPrezimeProf;
    //ocenu - od 5 do 10
    private int ocena;

    //konstruktore
    public ZeleniKarton(String imeIPrezimeStudent, int brojIndeksa, String predmet, String imeIPrezimeProf, int ocena) {
        this.imeIPrezimeStudent = imeIPrezimeStudent;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.imeIPrezimeProf = imeIPrezimeProf;
        this.ocena = ocena;
    }
    //gettere i settere
    public String getImeIPrezimeStudent() {
        return imeIPrezimeStudent;
    }
    public void setImeIPrezimeStudent(String imeIPrezime) {
        this.imeIPrezimeStudent = imeIPrezime;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
    public void setImeIPrezimeProf(String imeIPrezimeProf) {
        this.imeIPrezimeProf = imeIPrezimeProf;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }
    public String getImeIPrezimeProf() {
        return imeIPrezimeProf;
    }
    public int getOcena() {
        return ocena;
    }

    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    public boolean jePolozio(int ocena) {
        if (ocena > 5) {
            return true;
        } else {
            return false;
        }
    }
    //metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime............P.S.: malo sam promenila ispis u konzoli, preglednije mi je
    public void stampa() {
        System.out.print( this.predmet);
        if (this.jePolozio(this.ocena)) {
            System.out.println(" - (" + this.ocena + ")");
            System.out.println("Student: " + this.imeIPrezimeStudent + "\n"  + "Br.indexa: " + this.brojIndeksa);
            System.out.println("Profesor: " + this.imeIPrezimeProf);
        } else {
            System.out.println("Nije polozio ispit.");
        }
        System.out.println();
    }
}

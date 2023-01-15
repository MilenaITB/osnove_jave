package d_13_01_2023;


//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
public class Ispit {
    private String predmet;
    private int ocena;
    private String profesor;

    //gettere i settere za sve atribute
    public String getPredmet() {
        return predmet;
    }
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    //konstuktore koje mislite da ce vam trebati
    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }
    //metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
    public boolean polozen(){
        return this.ocena > 5;
    }
    //metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
    public void stampajIspit(){
        System.out.println(this.predmet + " - " + this.profesor + " - " + this.ocena);
    }
}
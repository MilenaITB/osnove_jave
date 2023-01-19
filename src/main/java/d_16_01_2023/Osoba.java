package d_16_01_2023;

//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;
    protected String godRodj;

    //default-ni konstuktor
    public Osoba(){
    }
    //        konstuktor sa parametrima
    public Osoba(String imeIPrezime, String jmbg, String godRodj) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godRodj = godRodj;
    }

    //       gettere i settere
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getJmbg() {
        return jmbg;
    }
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    public String getGodRodj() {
        return godRodj;
    }
    public void setGodRodj(String godRodj) {
        this.godRodj = godRodj;
    }

    //        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
     public void stampaj(){
         System.out.println("Ime i prezime: " + this.imeIPrezime + "\n"
                 + "JMBG: " + this.jmbg + "\n" + "Godina rodjenja: " + this.godRodj);
     }

}

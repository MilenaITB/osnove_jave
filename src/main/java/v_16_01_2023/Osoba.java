package v_16_01_2023;

//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodj;
    public Osoba(){

    }

    public Osoba(String imeIPrezime, String jmbg, int godinaRodj) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodj = godinaRodj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodinaRodj() {
        return godinaRodj;
    }

    public void setGodinaRodj(int godinaRodj) {
        this.godinaRodj = godinaRodj;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godinaRodj);
    }
}
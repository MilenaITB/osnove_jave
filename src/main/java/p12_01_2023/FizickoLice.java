package p12_01_2023;

///
public class FizickoLice {


    private String imeIPrezime;
    private String brlk;
    private String jmbg;
    private boolean kupovao;

    public FizickoLice(String jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String imeIPrezime, String brlk, String jmbg, boolean kupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brlk = brlk;
        this.jmbg = jmbg;
        this.kupovao = kupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrlk() {
        return brlk;
    }

    public void setBrlk(String brlk) {
        this.brlk = brlk;
    }

    public String getJmbg() {
        return jmbg;
    }


    public boolean isKupovao() {
        return kupovao;
    }

    public void setKupovao(boolean kupovao) {
        this.kupovao = kupovao;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + ", " + brlk);
    }
}

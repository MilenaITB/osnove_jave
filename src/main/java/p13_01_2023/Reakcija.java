package p13_01_2023;

//        Kreirati klasu Reakcija koja ima
//        tip reakcije (smajli, like, srce)
//        ime i prezime korisnika koji je reagovao
public class Reakcija {
    private String tip;
    private String reagovao;

    // reakcija ima gettere, settere

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getReagovao() {
        return reagovao;
    }

    public void setReagovao(String reagovao) {
        this.reagovao = reagovao;
    }

    //  konstruktore
    public Reakcija(String tip, String reagovao) {
        this.tip = tip;
        this.reagovao = reagovao;
    }

        }




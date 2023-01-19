package d_17_01_2023;

//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)

public class AudioControl extends Control{
    private boolean pojacaj;

    //gettere, settere i konstruktore
    public AudioControl(){
    }
    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }
    public boolean isPojacaj() {
        return pojacaj;
    }
    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    //implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
// U opsegu od 0 do 100

    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if (pojacaj = true){
            double novaJacina = videoPlayer.getJacinaZvuka() + 1;
            if (novaJacina > 100){
                novaJacina = 100;
            } videoPlayer.setJacinaZvuka(novaJacina);
        } else {
            double novaJacina = videoPlayer.getJacinaZvuka() - 1;
            if (novaJacina < 0){
                novaJacina = 0;
            } videoPlayer.setJacinaZvuka(novaJacina);
        }
    }

}







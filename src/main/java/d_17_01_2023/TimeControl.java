package d_17_01_2023;

//Kreirati klasu TimeControl koja nasledjuje
// klasu Control i konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)

public class TimeControl extends Control {
    private boolean pomeranjeVremena;

    public TimeControl(boolean pomeranjeVremena) {
        this.pomeranjeVremena = pomeranjeVremena;
    }

    //implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
// unapred ili unazad u zavisnosti od atributa.
// Veoma je bitno da se ne izadje van granica videa.


@Override
        public void izvrsiAkciju(VideoPlayer videoPlayer) {
         if (pomeranjeVremena = true) {
            double novoVreme = videoPlayer.getTrenutnoVreme() + 15;
            if (novoVreme > videoPlayer.getDuzina()) {
                novoVreme = videoPlayer.getDuzina();   // to je vrednost max duž.videa
            }
            videoPlayer.setTrenutnoVreme(novoVreme);
        }  else {
             double novoVreme = videoPlayer.getTrenutnoVreme() -15;
             if (novoVreme < 0){
                 novoVreme = 0; // to je min.duž.videa
             }  videoPlayer.setTrenutnoVreme(novoVreme);   // to je setovanje
         }
    }
}


package d_17_01_2023;

//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima "brzinu interneta u megabajtima," npr 10mb/s, 20mb/s, 7.9mb/s

public class QualityOptimizerControl extends Control{
    private double brzinaNet;


    // gettere, settere i konstruktore
    public QualityOptimizerControl(){
    }
    public QualityOptimizerControl(double brzinaNet) {
        this.brzinaNet = brzinaNet;
    }
    public double getBrzinaNet() {
        return brzinaNet;
    }
    public void setBrzinaNet(double brzinaNet) {
        this.brzinaNet = brzinaNet;
   }

//    implementira metodu izvrsi akciju tako sto postavlja kvalitet videa
// u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    //Kvalitet videa (144, 240, 360, 480, 720, 1080)

    public void izvrsiAkciju(VideoPlayer videoPlayer){
         double brzinaVidea = this.brzinaNet * 10.1;
            double kvalitet = 0.0;   // moram sama da inicijalizujem

            if(brzinaVidea < 144){
                 kvalitet = 144;
        } else if(brzinaVidea < 240){
                 kvalitet = 240;
            } else if(brzinaVidea < 360){
                 kvalitet = 360;
            } else if( brzinaVidea < 480){
                 kvalitet = 480;
            } else if(brzinaVidea < 720){
                 kvalitet = 720;
            } else if(brzinaVidea < 1080){
                 kvalitet = 1080;
            }else {
                 kvalitet = 2160;
            } videoPlayer.setKvalitetVidea(kvalitet);
    }
}

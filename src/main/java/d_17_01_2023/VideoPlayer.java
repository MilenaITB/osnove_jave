package d_17_01_2023;

// 1. Zadatak
//Kreirati klasu VideoPlayer koja ima:

    public class VideoPlayer {

        //duzinu videa
        //trenutno vreme videa
        //jacinu zvuka
        //Kvalitet videa (144, 240, 360, 480, 720, 1080)

    private double duzina;
    private double trenutnoVreme;
    private double jacinaZvuka;
    private double kvalitetVidea;

    //gettere, settere i konstruktore

        public double getDuzina() {
            return duzina;
        }
        public void setDuzina(double duzina) {
            this.duzina = duzina;
        }
        public double getTrenutnoVreme() {
            return trenutnoVreme;
        }
        public void setTrenutnoVreme(double trenutnoVreme) {
            this.trenutnoVreme = trenutnoVreme;
        }
        public double getJacinaZvuka() {
            return jacinaZvuka;
        }
        public void setJacinaZvuka(double jacinaZvuka) {
            this.jacinaZvuka = jacinaZvuka;
        }
        public double getKvalitetVidea() {
            return kvalitetVidea;
        }
        public void setKvalitetVidea(double kvalitetVidea) {
            this.kvalitetVidea = kvalitetVidea;
        }
        public VideoPlayer(double duzina, double trenutnoVreme, double jacinaZvuka, double kvalitetVidea) {
            this.duzina = duzina;
            this.trenutnoVreme = trenutnoVreme;
            this.jacinaZvuka = jacinaZvuka;
            this.kvalitetVidea = kvalitetVidea;
        }

        //metodu stampaj koja stampa podatke u formatu:
//      trenutno vreme videa
//      jacina zvuka
//      kavlitet videa

        public void stampaj(){
            System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
            System.out.println("Jacina zvuka: " + this.jacinaZvuka);
            System.out.println("Kvalitet videa: " + this.kvalitetVidea);
        }



}


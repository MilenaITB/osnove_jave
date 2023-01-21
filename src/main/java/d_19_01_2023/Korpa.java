package d_19_01_2023;

import java.util.ArrayList;


//Kreirati klasu Korpa koja ima:
//niz ambalaza

public class Korpa {
    private ArrayList<Ambalaza> nizAmbalaze;

    public Korpa(){
        this.nizAmbalaze = new ArrayList<>();
    }

    //metodu dodaj ambalazu
    public void dodajAmbalazu(Ambalaza a){
        this.nizAmbalaze.add(a);
    }

    //metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            if (this.nizAmbalaze.get(i).getBarkod().equals(barkod)){
                this.nizAmbalaze.remove(i);
            }
        }
    }

    //privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
    private double cenaAmbalazaSaPopustom(double popust){
        double suma = 0;
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            suma = suma + this.nizAmbalaze.get(i).cenaArtikla();
        }
        return suma - popust;
    }

    //metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
// kao parametar funkcije se prima Super karticu iz koje se cita popust.
    public double ukupnaCenaKorpe(SuperKartica kartica){
        double cenaKorpe = 0;
        for (int i = 0; i < this.nizAmbalaze.size(); i++) {
            cenaKorpe = cenaKorpe + this.nizAmbalaze.get(i).cenaArtikla();
        }
        return cenaKorpe - kartica.getPopust();
    }
}
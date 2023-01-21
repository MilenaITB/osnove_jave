package d_19_01_2023;

//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena


public class Tetrapak extends Ambalaza {
    private boolean zaReciklazu;
    private double osnovnaCena;


    //gettere i setter za atribute
    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }
    public boolean isZaReciklazu() {
        return zaReciklazu;
    }
    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    //konstuktori koji su vam potrebni

    public Tetrapak(){
    }

    public Tetrapak(String barkod, String naziv, double netoTezina,
                    double brutoTezina, boolean zaReciklazu, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    //racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena

    @Override

    public double cenaArtikla() {
        if (this.zaReciklazu){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else{
            return this.osnovnaCena;
        }
    }

    @Override
    //metoda stampaj stampa sve podatke iz klase tetrapak.

        public void stampaj() {
        System.out.println("Barkod: " + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getNaziv());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        if(zaReciklazu){
            System.out.println("Moze da se reciiklira.");
        } else {
            System.out.println("Nije za reciklazu.");
        }
        System.out.println("Cena: " + this.cenaArtikla());
    }
}

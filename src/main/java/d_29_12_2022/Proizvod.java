package d_29_12_2022;


    // Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)


//i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju
// treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a
// povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
// Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
// Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din

public class Proizvod {
    private String naziv;
    private double cena;
    private double tezinaGr;

    public String getNaziv(){

        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public double getCena(){
        return cena;
    }

    public void setCena(double cena){
        this.cena = cena;
    }

    public double getTezinaGr(){
        return tezinaGr;
    }

    public void setTezinaGr(double tezinaGr){
        this.tezinaGr = tezinaGr;
    }

    public void stampaj(){
        System.out.println(naziv + ":  " + cena + " €" + ", " + tezinaGr + " grama");
    }

    public void povecajCenu(double povecanje){
        cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust){
        double popustOdCene = (cena * popust) / 100;
        return cena - popustOdCene;
        }

        public double racunajPostarinu(){
        if(tezinaGr <= 100){
            return 200;
        } else if(tezinaGr > 100 && tezinaGr <= 500){
            return 400;
        } else if(tezinaGr > 500){
            return 1000;
        } else {
            return 0;
        }
    }



}
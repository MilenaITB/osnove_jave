package d_12_01_2023;

//Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
public class Transakcija {
    private String id;
    private Racun posiljalac;
    private Racun primalac;


    //gettere i settere
    public String getId() {
        return id;
    }
    public Racun getPosiljalac() {
        return posiljalac;
    }
    public Racun getPrimalac() {
        return primalac;
    }
    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }
    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    //konstruktore
    public Transakcija(String id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
//      ako je prenos sredstava veci od 4500, provizija je 1%

    private double provizija(double vrednostTrans){
        if(vrednostTrans < 4500){
            return 45;
        }
        return vrednostTrans * 0.01;
    }

    //      S obzirom da se provizija racuna na osnovu visine transakcije, znaci da
//      metoda prima parametar koji predstavlja visinu transakcije
//      Ukoliko ne znate da resite ovu metodu,
//      u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//      metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//      Kao parametar funkcije se unosi vrednost koja se prebacuje.


    public void izvrsiTransakciju(double vrednostTrans){

        double sumaPosilj = vrednostTrans + provizija(vrednostTrans);
        double sumaPrim = posiljalac.getStanje() - provizija(vrednostTrans);
        if(sumaPrim <= 0){
            sumaPrim = 0;
        }
        //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//          a na drugi racun dodaje samo (trazena suma).

        if(this.posiljalac.getStanje() > sumaPosilj){
            this.posiljalac.novoStanje(this.posiljalac.getStanje() - sumaPosilj);
            this.primalac.novoStanje(this.primalac.getStanje() + vrednostTrans);
        } else{

            this.primalac.novoStanje(this.primalac.getStanje() + sumaPrim);
            this.posiljalac.novoStanje(0);

        }
    }
    //metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
//
    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa: " + posiljalac.getImeIPrezime() + " - " + posiljalac.getBroj());
        System.out.println("Racun na: " + primalac.getImeIPrezime() + " - " + primalac.getBroj());



    }
}

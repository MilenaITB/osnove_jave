package p17_01_2023;

//Kreirati abstraktnu klasu Figura koja ima
public abstract class Figura {

    //abstraktnu metodu povrsina
    public abstract double povrsina();
    //abstraktnu metodu obim
    public abstract double obim();

    //metodu koja stampa podatke u formatu:
//  Povrsina je (povrsina)
//  Obim je (obim)

    public void stampaj() {
        System.out.println("Provrsina: " + this.povrsina());
        System.out.println("Obim: " + this.obim());
    }
}
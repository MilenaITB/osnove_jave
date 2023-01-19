package p17_01_2023;
//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//stranice a i b


public class Pravougaonik extends Figura{
    private int a;
    private int b;

    //gettere/settere/konstruktore
    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //implementira metodu povrsina
    @Override
    public double povrsina() {
        return a * b;
    }
    //implementira metodu obim
    @Override
    public double obim() {
        return (a + b) * 2;
    }
}
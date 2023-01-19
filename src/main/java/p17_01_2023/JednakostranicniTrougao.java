package p17_01_2023;

//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:

public class JednakostranicniTrougao extends Figura{
    //stranicu a
    private double a;

    //gettere/settere/konstruktore
    public JednakostranicniTrougao(double a) {
        this.a = a;
    }
    //implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
    @Override
    public double povrsina() {
        return a * a * 1.73;
    }
    //implementira metodu obim
    @Override
    public double obim() {
        return 3 * a;
    }
}
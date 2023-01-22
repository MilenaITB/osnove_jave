package p19_01_2023;

public class JednakostranicniTrougao extends Figura{
    private double a;

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a * a * 1.73;
    }

    @Override
    public double obim() {
        return 3 * a;
    }
}
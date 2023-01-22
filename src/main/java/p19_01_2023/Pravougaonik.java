package p19_01_2023;

public class Pravougaonik extends Figura{
    private int a;
    private int b;

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double obim() {
        return (a + b) * 2;
    }
}
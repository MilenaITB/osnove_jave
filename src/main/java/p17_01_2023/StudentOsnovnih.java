package p17_01_2023;

//	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    //za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
    @Override
    public boolean naBudzetu() {
        return this.godinaStudija < 5;
    }

    //koja za cenu skolarine vraca 90000
    @Override
    public int cenaSkolarine() {
        return 90000;
    }

}
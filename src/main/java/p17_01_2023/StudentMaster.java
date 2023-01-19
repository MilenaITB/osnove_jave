package p17_01_2023;

//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:

public class StudentMaster extends Student{

    public StudentMaster(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    //za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
    @Override
    public boolean naBudzetu() {
        return this.godinaStudija < 2;
    }

    //koja za cenu skolarine vraca 100000
    @Override
    public int cenaSkolarine() {
        return 100000;
    }
}
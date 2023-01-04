package p29_12_2022;

// 4. Zadatak
////Kreirati klasu Student koja ima:
////ime
////prezime
////broj indeksa (int)
////da li je na budzetu
////gettere i settere za sve atributge

public class Zadatak4 {
    public static void main(String[] args) {
        Student milan = new Student();
        milan.setIme("Milan");
        milan.setPrezime("Jovanovic");
        milan.setBrojIndeksa(15150);
        milan.setNaBudzetu(false);


        System.out.println("IME: " + milan.getIme());
        System.out.println("PREZIME: " + milan.getPrezime());
        System.out.println("INDEX: " + milan.getBrojIndeksa());
        System.out.println("FIB: " + milan.getNaBudzetu());



    }
}
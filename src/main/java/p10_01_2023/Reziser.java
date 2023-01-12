package p10_01_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;

    private Film reziraoJe;

    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }
    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public Reziser(String imeIPrezime, int starost, Film reziraoJe) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
        this.reziraoJe = reziraoJe;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampaj() {
        System.out.println("IME I PREZIME: " + this.imeIPrezime);
        System.out.println("STAROST: " + this.starost);
        if (this.reziraoJe != null) {
            System.out.println("REZIRAO JE: " + this.reziraoJe.getNaziv());
            System.out.println("GODINE " + this.reziraoJe.getGodina());
        } else {
            System.out.println("NIje rezirao nijedan film.");
        }

    }

    public void promeniNazivFilma() {
        this.reziraoJe.setNaziv("Bla bla");
    }

}

// public class Reziser {
//    private String imeIPrezime;
//    private int starost;
//
////    private Film reziraoJe;
//
////    public void setReziraoJe(Film reziraoJe) {
////        this.reziraoJe = reziraoJe;
////    }
//    public Reziser(String imeIPrezime, int starost) {
//        this.imeIPrezime = imeIPrezime;
//        this.starost = starost;
//    }
//
////    public Reziser(String imeIPrezime, int starost, Film reziraoJe) {
////        this.imeIPrezime = imeIPrezime;
////        this.starost = starost;
////        this.reziraoJe = reziraoJe;
////    }
//
//    public String getImeIPrezime() {
//        return imeIPrezime;
//    }
//
//    public void setImeIPrezime(String imeIPrezime) {
//        this.imeIPrezime = imeIPrezime;
//    }
//
//    public int getStarost() {
//        return starost;
//    }
//
//    public void setStarost(int starost) {
//        this.starost = starost;
//    }
//
//    public void stampaj() {
//        System.out.println("IME I PREZIME: " + this.imeIPrezime);
//        System.out.println("STAROST: " + this.starost);
//
//    }
//
//
//}
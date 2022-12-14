package p_13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]
//
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
//                Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5

        String sifraProizvoda = "xweoi23";
        String nazivProizvoda = "Nike patike";
        int cenaProizvoda = 90;
        double popustProizvoda = 13.5;
        String bojaProizvoda = "Crna";
        double velicinaProizvoda = 46.5;
        //        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + "  - $"
                + cenaProizvoda
                + " - Popust "
                + popustProizvoda + "%");
        System.out.println(bojaProizvoda + ", " + velicinaProizvoda); }
}
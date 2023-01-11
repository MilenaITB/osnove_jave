package d_10_01_2023;


// Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)


    public class Knjiga {
        private String isbn;
        private String naziv;
        private int godinaIzdanja;
        private Autor autor;

        public Knjiga(String isbn){
            this.isbn = isbn;
        }
        public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor){
            this.isbn = isbn;
            this.naziv = naziv;
            this.godinaIzdanja = godinaIzdanja;
            this.autor = autor;
        }
        public String getNaziv() {
            return naziv;
        }
        public void setNaziv(String naziv) {
            this.naziv = naziv;
        }
        public int getGodinaIzdanja() {
            return godinaIzdanja;
        }
        public void setGodinaIzdanja(int godinaIzdanja) {
            this.godinaIzdanja = godinaIzdanja;
        }
        public Autor getAutor() {
            return autor;
        }
        public void setAutor(Autor autor) {
            this.autor = autor;
        }
        public String getIsbn() {
            return isbn;
        }

        public void stampaj(){
            System.out.println(isbn);
            System.out.println(naziv + " - " + godinaIzdanja);
            System.out.print("Autor: ");
            autor.stampaj();
        }
    }
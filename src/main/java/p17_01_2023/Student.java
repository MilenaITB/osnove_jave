package p17_01_2023;
//Kreirati apstraktnu klasu Student koja ima:
//ime i prezime studenta
//broj indeksa
//godinu studija

    public abstract class Student {      // to je osnovna klasa i zato za

        protected String imeIPrezime;   // atribute dodeljujemo PROTECTED da bi im se dodelio PRAVO PRISTUPA
        protected String index;
        protected int godinaStudija;

        //gettere, settere i konstruktore

        public Student(String imeIPrezime, String index, int godinaStudija) {
            this.imeIPrezime = imeIPrezime;
            this.index = index;
            this.godinaStudija = godinaStudija;
        }

        public String getImeIPrezime() {
            return imeIPrezime;
        }
        public void setImeIPrezime(String imeIPrezime) {
            this.imeIPrezime = imeIPrezime;
        }
        public String getIndex() {
            return index;
        }
        public void setIndex(String index) {
            this.index = index;
        }
        public int getGodinaStudija() {
            return godinaStudija;
        }
        public void setGodinaStudija(int godinaStudija) {
            this.godinaStudija = godinaStudija;
        }

//      apstraktnu metodu koja vraca cenu skolarine.

        public abstract int cenaSkolarine();


        //apstraktnu metodu koja vraca da li je student na buzetu ili ne.

        public abstract boolean naBudzetu();
        //....da ili ne mi odmah ukazuje na true i false !
        // nije svaki student isti tako da tu implementaciju treba da izvede svaka klasa za sebe
        // zato je i apstraktna
        // zato što je
        // ova = JEDNA METODA APSTRAKTNA
        // MORA CELA KLASA DA BUDE APSTRAKTNA


        //metodu koja stampa podatke u formatu:
//  ime i prezime, broj indeksa, godina studija
//  Finansiranje: budzet/samofinansirajuci
//  Cena skolarine: cena
         public void stampa(){
             System.out.println(this.imeIPrezime + ", " + "Broj indexa: " + this.index + ", "
                     + "Godina studija: " + this.godinaStudija);

             if(this.naBudzetu()){
                 System.out.println("Finansiranje: budzet");
                 System.out.println("Cena skolarine: " + this.cenaSkolarine());
             } else {
                 System.out.println("Finansiranje: samofinansirajuci");
                 System.out.println("Cena skolarine: " + this.cenaSkolarine());
             }
         }
    }

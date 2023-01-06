package d_29_12_2022;

//.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku
// mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//gettere za sve atribute
//settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

public class Zadatak2 {

    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        post1.setName("Mimi");
        post1.setFrendName("Vladimir Minic");
        post1.setText("Srecan rodjendan ! \n Hvala ! Cekam te u kafanu :)");

        post1.like();
        post1.like();
        post1.like();
        post1.dislike();
        post1.share();
        post1.print();

        System.out.println("********************");

        FacebookPost post2 = new FacebookPost();
        post2.setName("Milan Jovanovic");
        post2.setFrendName("Vladimir Minic");
        post2.setText("Srecna nam jos jedna mala matura i jos jedna ITB generacija :) \n ITB sam sit kafanoooo :)");

        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.dislike();
        post2.share();
        post2.share();
        post2.share();
        post2.print();

    }
}
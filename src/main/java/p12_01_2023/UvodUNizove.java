package p12_01_2023;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class UvodUNizove {
    public static void main(String[] args) {

        // hoću da napravim niz tih Usera i za to koristim nizove.
        // hoću da iskoristim ArrayListu.
        // ova A.lista kao TIP mora da dobije kog je tipa svaki element u tom nizu.
        // svaki element u ovom nizu je User. Ovaj NIZ čuva adrese do pravih Usera

        ArrayList<User> users = new ArrayList<User>(); // imamo inicijalno neki NIZ

        User m = new User("Milan", "Jovanovic");  // user m
        User n = new User("Nikola", "Nikklic");     // user n


                        // naš niz je niz adresa do user objekata
        users.add(m); // User@9320932     // u niz smestim te objekte
        users.add(n); //  na nultoj poziciji je adresa  User@2190320
        System.out.println("KRAJ");
// dodavanje u niz se radi kao i bilo koje dodavanje;
// da li radi sa:
// -primitivnim ili običnim tipovima (String, int, double, boolean)
// -sa objektima....niz čuva te stvari
//  jedino što se sada razlikuje kada pristupamo svakom elementu,
//  taj element nije primitivnog tipa pa da ga samo štampamo   System.out.println("KRAJ");
        //   već svaki element jeste OBJEKAT,
        //   i nad tim objektom možemo da zovemo sve ono što taj objekat nudi (User)

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getIme() + " " + users.get(i).getPrezime());
        }
    }
}
package p12_01_2023;

//	Kreirati klasu ZoomCall koja ima:

//link za poziv
//password
//korisnika koji je host
//korisnika koji je guest
//metodu pokreni poziv koja stampa podatke u formatu:
//
//		Zoom Call: url
//		Password: password
//		Host: ime i prezime
//		Guest: ime i prezime
//		Maksimalno trajanje poziva je (broj minuta)min
//
//		Maksimalno trajanje poziva se cita od korisnika koji je host!
//public class ZoomCall {
//    public String pokreniPoziv;
//    private String url;
//    private String password;
//    private Korisnik host;
//    private Korisnik guest;
//
//    public void setGuest(Korisnik guest) {
//        this.guest = guest;
//    }
//
//    //   1. konstruktor sa obaveznim stvarima:
//    public ZoomCall(String url, String password, Korisnik host)    {
//        this.url = url;
//        this.password = password;
//        this.host = host;
//
//// 2. konstruktor koji ima i nešto opciono, razlikuje se što ovaj može da primi odmah i guest-a
//        public ZoomCall(String url, String password, Korisnik host, Korisnik guest){
//            this.url = url;
//            this.password = password;
//            this.host = host;
//            this.guest = guest;
//
//        }
//
//
//
////     setter samo za guest-a
//// guest na zoom call-u može da se menja, sve ostalo ne !
//
//    public void setGuest(Korisnik guest) {
//        this.guest = guest;
//    }
////      gettere za sve atribute
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public Korisnik getHost() {
//        return host;
//    }
//
//    public Korisnik getGuest() {
//        return guest;
//    }
//
//    public void pokreniPoziv(){
//            System.out.println("URL: " + this.url);
//            System.out.println("PASSWORD: " + this.password);
//            System.out.println("HOST: " + this.host.getImeIPrezime());
//            if(this.guest != null){
////            System.out.println("GUEST: " + this.guest.getImeIPrezime());
//          System.out.println("GUEST: " + this.guest.getImeIPrezime();
//
//        }
//        }
//    }
//}
//

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String url, String password, Korisnik host) {
        this.url =url;
        this.password = password;
        this.host = host;
    }

    public ZoomCall(String url, String password, Korisnik host, Korisnik guest) {
        this.url =url;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }


    public void pokreniPoziv() {
        System.out.println("URL: "+ this.url);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("HOST: " + this.host.getImeIPrezime());
        if (this.guest != null ) {
//            System.out.println("GUEST: " + this.guest.getImeIPrezime());
            System.out.println("GUEST: " + this.guest.getImeIPrezime());
        }

    }


}

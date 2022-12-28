package p27_12_2022;

import java.util.Scanner;

//public class Zadatak2 {

    //  2.Zad
    //Krairti klasu SlackMessage koja ima:
    //tekst poruke
    //ime i prezime osobe koja je stavila poruku
    //datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
    //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima
    // i ostampati obe poruke u formatu:
    //[ime i prezime osobe] - [kad je poslata]
    //[Tekst poruke]
    //
    //Dopuna:
    //Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u
    // formatu koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.


//                     MOJE REŠAVANJE NA ČASU

//      MILANOVO REŠENJE


//package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        SlackMessage helloMsg = new SlackMessage();
        helloMsg.text = "Hello!";
        helloMsg.firstName = "Milan";
        helloMsg.lastName = "Jovanovic";
        helloMsg.createdAt = "26.08.2021 18:55";

        helloMsg.print();

        SlackMessage replayMsg = new SlackMessage();
        replayMsg.text = "Hi!";
        replayMsg.firstName = "Petar";
        replayMsg.lastName = "Petrovic";
        replayMsg.createdAt = "26.08.2021 18:55";

        replayMsg.print();

    }
}
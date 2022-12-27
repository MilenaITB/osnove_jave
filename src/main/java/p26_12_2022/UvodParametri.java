package p26_12_2022;

import java.util.Scanner;

public class UvodParametri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime:");
        String i = s.next();
        String prezime = "Jovnaovic";
        int mesec = 5;
        int godina = 24;
        String brojKartice = "12340-3494-3434-2323";


        printCard(i, prezime, mesec, godina + 5, brojKartice);


        printCard("Dragan", "Draganovic",
                7, 25, "12660-7878-9999-8898");
    }


    public static void printCard(String ime, String prezime,
                                 int mesec, int godina, String brojKartice) {
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*    ******                   *");
        System.out.println("*    ******                   *");
        System.out.println("*                             *");
        System.out.println("*              "+mesec+"/"+godina+"         *");
        System.out.println("*       " +ime + " " +prezime+ "       *");
        System.out.println("*      "+brojKartice+"    *");
        System.out.println("*                             *");
        System.out.println("*******************************");

    }

}
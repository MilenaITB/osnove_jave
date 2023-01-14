package d_12_01_2023;

// 1. Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton z1 = new ZeleniKarton("Aleksandar Jevitc" , 3254 ,
                "Writing test cases and bud reports",
                "Dragoljub Boranijasevic", 8);
        ZeleniKarton z2 = new ZeleniKarton("Andrija Antic", 3258, "Agile methodology",
                "Dragoljub Boranijasevic",8);
        ZeleniKarton z3 = new ZeleniKarton("Jovan Ilic", 6985,
                "JIRA tool for project management", "Dragoljub Boranijasevic",
                10);
        ZeleniKarton z4 = new ZeleniKarton("Milos Savic", 5879,
                "TastRail tool for writing and tracking test cases",
                "Milan Jovanovic",9);
        ZeleniKarton z5 = new ZeleniKarton("Stefanija Spasic" , 5971, "SQL(CRUD)",
                "Milan Jovanovic",10);
        ZeleniKarton z6 = new ZeleniKarton("Vuk Stanojevic", 1259, "Java OOP",
                "Vladimir Minic", 10);
        ZeleniKarton z7 = new ZeleniKarton("Anita Nestorovic", 5689, "Selenium",
                "Vladimir Minic",8);
        ZeleniKarton z8 = new ZeleniKarton("Nikola Prvulovic", 9863, "TestNg",
                "Milan Jovanovic",10);
        ZeleniKarton z9 = new ZeleniKarton("Tamara Mitrovic", 6781, "Postman",
                "Vladimir Minic",10);
        ZeleniKarton z10 = new ZeleniKarton("Goran Mitic", 1123, "GitHub",
                "Milan Jovanovic",10);


        ispiti.add(z1);
        ispiti.add(z2);
        ispiti.add(z3);
        ispiti.add(z4);
        ispiti.add(z5);
        ispiti.add(z6);
        ispiti.add(z7);
        ispiti.add(z8);
        ispiti.add(z9);
        ispiti.add(z10);

        for (int i = 0; i <ispiti.size() ; i++) {
            ispiti.get(i).stampa();
        }

    }

}




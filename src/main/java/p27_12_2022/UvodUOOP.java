package p27_12_2022;

public class UvodUOOP {
    public static void main(String[] args) {
        User milan = new User();
        milan.firstName = "Milan";
        milan.lastName = "Jovanovic";
        milan.yearOfBirth = 1995;
//        milan.stampaj();
//        milan.stampajStarost(2022);
        int starost = milan.vratiStarost(2022);
//        User.stampajUsera(milan.firstName, milan.lastName, milan.age);

        User nikola = new User();
        nikola.firstName = "Nikola";
        nikola.lastName = "Nikolic";
        nikola.yearOfBirth = 2000;
//        nikola.stampaj();
        nikola.stampajStarost(2023);
//        User.stampajUsera(nikola.firstName, nikola.lastName, nikola.age);

    }
}
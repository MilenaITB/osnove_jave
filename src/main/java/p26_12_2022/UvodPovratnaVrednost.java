package p26_12_2022;

public class UvodPovratnaVrednost {

    public static void main(String[] args) {
//        int x = suma(10, 5);

        int z = abs(5);
        System.out.println(z);
//        int n = s.nextInt();

    }
    // void => ne vracamo nista
// int, double, boolean, String, char, ArrayList<String> ....
    public static int suma (int a, int b) {
        int suma = a + b;

        return suma + 232;
    }

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else if (x > 0) {
            return x;
        } else {
            return 0;
        }

    }


}
package p16_12_2022;

import java.util.Scanner;

public class UvodPetlje {
    public static void main(String[] args) {


        //      I NAČIN:

//       for (int i = 1; i < 6; i++) {
//           System.out.print(i + ",");
//       }
//        for (int i = 10; i < 16; i++) {
//            System.out.print(i + ", ");
//
//        }

//        }

        //         II NAČIN:
        //   1, 2, 3, 4, 5, .........10, 11, 12, 13, 14, 15

        for (int i = 1; i < 16; i++) {
            if (i <= 5 || i >= 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(" . ");
            }
        }
    }
}





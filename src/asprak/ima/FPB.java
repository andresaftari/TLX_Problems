package asprak.ima;

import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input1 = sc.nextInt(), input2 = sc.nextInt();
        System.out.println(findFPB(input1, input2));
    }

    private static int findFPB(int angka1, int angka2) {
        if (angka1 == 0) {
            return angka2;
        } else {
            return findFPB(angka2 % angka1, angka1);
        }
    }
}

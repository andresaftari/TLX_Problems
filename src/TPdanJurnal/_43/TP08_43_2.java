package TPdanJurnal._43;

import java.util.Scanner;

public class TP08_43_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");

            System.out.println();
        }
    }
}
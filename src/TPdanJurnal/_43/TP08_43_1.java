package TPdanJurnal._43;

import java.util.Scanner;

public class TP08_43_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deret = scanner.nextInt();
        int posisiBintang = scanner.nextInt();

        for (int i = 0; i < deret; i++) {
            if (i % posisiBintang == 0) System.out.print(" * ");
            else System.out.print(i + " ");
        }
    }
}
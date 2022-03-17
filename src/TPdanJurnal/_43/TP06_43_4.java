package TPdanJurnal._43;

import java.util.Scanner;

public class TP06_43_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueA = scanner.nextInt();
        int valueB = scanner.nextInt();
        int valueC = scanner.nextInt();

        operation(valueA, valueB, valueC);
    }

    private static void operation(int a, int b, int c) {
        double determinant = b * b - 4 * a * c;
        int pembagi = 2 * a;

        double positif = -b + Math.sqrt(determinant);
        double x1 = positif /pembagi;

        int negatif = (int) (-b - Math.sqrt(determinant));
        int x2 = negatif / pembagi;

        System.out.println(x1 + " " + x2);
    }
}
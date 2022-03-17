package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal12_44_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        int[][] matrix = new int[max][max];

        for (int row = 0; row < max; row++) for (int col = 0; col < max; col++) matrix[row][col] = scanner.nextInt();

        for (int row = max - 1; row >= 0; row--) {
            for (int col = 0; col < max; col++) System.out.print(matrix[row][col] + " ");
            System.out.println();
        }
    }
}
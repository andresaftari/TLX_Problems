package TPdanJurnal._44;

import java.util.Scanner;

public class TP12_44_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0, max = scanner.nextInt();

        int[][] matrixA = new int[max][max];
        int[][] matrixB = new int[max][max];
        int[][] result = new int[max][max];

        // Input matrix A
        for (int row = 0; row < max; row++) for (int col = 0; col < max; col++) matrixA[row][col] = scanner.nextInt();

        // Input matrix B
        for (int row = 0; row < max; row++) for (int col = 0; col < max; col++) matrixB[row][col] = scanner.nextInt();

        for (int row = 0; row < max; row++) {
            for (int col = 0; col < max; col++) {
                for (int k = 0; k < max; k++) jumlah += matrixA[row][k] * matrixB[k][col];
                result[row][col] = jumlah;
                jumlah = 0;
            }
        }

        for (int row = 0; row < max; row++) {
            for (int col = 0; col < max; col++) System.out.print(result[row][col] + " ");
            System.out.println();
        }
    }
}

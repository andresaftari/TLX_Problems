package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal12_44_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        int[][] matrix = new int[max][max];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt(); // Input data kedalam index baris ke-i dan index kolom ke-i
            }
        }

        int winner = 0, blank = 0;
        boolean isWin = false;
        boolean isBlank = false;

        for (int i = 0; i < matrix.length; i++) {
            // Cek mendatar
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][i] != matrix[i][j]) {
                    break;
                } else {
                    if (j == matrix.length - 1) {
                        isWin = true;
                        winner = matrix[i][i];
                    }
                }
            }
            if (isWin) {
                break;
            }

            // Cek menurun
            for (int m = 0; m < matrix.length; m++) {
                if (matrix[i][i] != matrix[m][i]) {
                    break;
                } else {
                    if (m == matrix.length - 1) {
                        isWin = true;
                        winner = matrix[i][i];
                    }
                }
            }
            if (isWin) {
                break;
            }

            // diagonal kiri atas kanan bawah
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][i] != matrix[k][matrix.length - (1 + k)]) {
                    break;
                } else {
                    if (k == matrix.length - 1) {
                        isWin = true;
                        winner = matrix[i][i];
                    }
                }
            }
            if (isWin) {
                break;
            }

            // diagonal kanan atas kiri bawah
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][i] != matrix[k][k]) {
                    break;
                } else {
                    if (k == matrix.length - 1) {
                        isWin = true;
                        winner = matrix[i][i];
                    }
                }
            }
            if (isWin) {
                break;
            }

            // Cek yang kosong
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    isBlank = true;
                    blank = matrix[i][i];
                    break;
                }
            }
            if (isBlank) {
                break;
            }
        }

        switch (winner) {
            case 0:
                if (blank > 0) {
                    System.out.println("?");
                } else {
                    System.out.println("-");
                }
                break;

            case 1:
                System.out.println("O"); // Kondisi X menang
                break;

            case 2:
                System.out.println("X"); // kondisi O menang
                break;
        }
    }
}
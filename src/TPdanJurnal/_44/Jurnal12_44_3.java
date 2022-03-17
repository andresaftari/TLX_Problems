package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal12_44_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int value = 1, colMin = 0, colMax = max - 1, rowMin = 0, rowMax = max - 1;

        int[][] arrOfSpiral = new int[max][max];

        while (value <= max * max) {
            // Kanan
            for (int i = rowMin; i <= rowMax; i++) {
                arrOfSpiral[i][colMin] = value;
                value++;
            }

            // Bawah
            for (int i = colMin + 1; i <= colMax; i++) {
                arrOfSpiral[rowMax][i] = value;
                value++;
            }

            // Kiri
            for (int i = rowMax - 1; i >= rowMin; i--) {
                arrOfSpiral[i][colMax] = value;
                value++;
            }

            // Atas
            for (int i = colMax - 1; i >= colMin + 1; i--) {
                arrOfSpiral[rowMin][i] = value;
                value++;
            }

            colMin++;
            rowMin++;
            colMax--;
            rowMax--;
        }

        for (int[] arr : arrOfSpiral) {
            for (int i = 0; i < arrOfSpiral.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
}
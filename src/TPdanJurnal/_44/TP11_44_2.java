package TPdanJurnal._44;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TP11_44_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int banyakPeserta = scanner.nextInt();
        Integer[] arrOfNum = new Integer[banyakPeserta];

        for (int i = 0; i < arrOfNum.length; i++) {
            int num = scanner.nextInt();
            arrOfNum[i] = num;
        }

        Arrays.sort(arrOfNum, Collections.reverseOrder());

        for (int num : arrOfNum) {
            System.out.print(num + " ");
        }
    }
}
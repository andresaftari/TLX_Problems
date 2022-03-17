package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal11_44_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = scanner.nextInt();

        int[] arrOfNum = new int[maximum];
        int input;

        for (int i = 0; i < arrOfNum.length; i++) {
            input = scanner.nextInt();
            arrOfNum[i] = input;
        }

        findMaximumModus(arrOfNum);
    }

    private static void findMaximumModus(int[] arrOfNum) {
        int modus = arrOfNum[0];
        int temp = 1;

        for (int i = 0; i < arrOfNum.length - 1; i++) {
            if (arrOfNum[i] > 0) {
                int count = 1;

                for (int j = i + 1; j < arrOfNum.length; j++) {
                    if (arrOfNum[i] == arrOfNum[j]) {
                        arrOfNum[j] = 0;
                        count++;
                    }
                }

                if (count > temp) {
                    temp = count;
                    modus = arrOfNum[i];
                } else if (count == temp) if (arrOfNum[i] > modus) modus = arrOfNum[i];
            }
        }
        System.out.println(modus);
    }
}
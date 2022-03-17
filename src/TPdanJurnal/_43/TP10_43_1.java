package TPdanJurnal._43;

import java.util.Scanner;

public class TP10_43_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakAmoeba = scanner.nextInt();
        int minute = 0;

        while (banyakAmoeba > 30) {
            banyakAmoeba *= 0.5;
            minute += 15;
        }
        System.out.println(minute);
    }
}
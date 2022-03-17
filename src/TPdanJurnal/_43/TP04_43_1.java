package TPdanJurnal._43;

import java.util.Scanner;

public class TP04_43_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int programDira = scanner.nextInt();

        switch (programDira) {
            case 1 -> System.out.println("janvier");
            case 2 -> System.out.println("fevrier");
            case 3 -> System.out.println("mars");
            case 4 -> System.out.println("avril");
            case 5 -> System.out.println("mai");
            case 6 -> System.out.println("juin");
            case 7 -> System.out.println("juillet");
            case 8 -> System.out.println("aout");
            case 9 -> System.out.println("septembre");
            case 10 -> System.out.println("octobre");
            case 11 -> System.out.println("novembre");
            case 12 -> System.out.println("decembre");
        }
    }
}
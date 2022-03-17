package TPdanJurnal._43;

import java.util.Scanner;

public class TP04_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namaHari = scanner.nextInt();
        namaHari %= 7;

        switch (namaHari) {
            case 0 -> System.out.println("vendredi");
            case 1 -> System.out.println("samedi");
            case 2 -> System.out.println("dimanche");
            case 3 -> System.out.println("lundi");
            case 4 -> System.out.println("mardi");
            case 5 -> System.out.println("mercredi");
            case 6 -> System.out.println("jeudi");
        }
    }
}
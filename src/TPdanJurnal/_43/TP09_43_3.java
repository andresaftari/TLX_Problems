package TPdanJurnal._43;

import java.util.Scanner;

public class TP09_43_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodeDNA1 = scanner.nextLine();
        String kodeDNA2 = scanner.nextLine();

        setDNA1(kodeDNA1, kodeDNA2);
    }

    // Cara 1
    private static void setDNA1(String kodeDNA1, String kodeDNA2) {
        String kode = "DNA identik";
        for (int i = 0; i < kodeDNA1.length(); i++) {
            if (kodeDNA1.charAt(i) != kodeDNA2.charAt(i)) {
                kode = "DNA berbeda";
                break;
            }
        }
        System.out.println(kode);
    }

    // Cara 2
    private static void setDNA2(String kodeDNA1, String kodeDNA2) {
        int beda = 0;
        for (int i = 0; i < kodeDNA1.length(); i++)
            if (kodeDNA1.charAt(i) != kodeDNA2.charAt(i)) {
                beda++;
                break;
            }

        if (beda == 0) System.out.println("DNA identik.");
        else System.out.println("DNA berbeda.");
    }
}
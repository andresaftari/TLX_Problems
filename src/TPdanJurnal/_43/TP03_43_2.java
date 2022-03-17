package TPdanJurnal._43;

import java.util.Scanner;

public class TP03_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakTelur = scanner.nextInt();

        int harga = 800;
        double total = 0;
        double diskon;

        System.out.println("Telur " + banyakTelur + " x " + harga + " = " + banyakTelur * harga);

        if (banyakTelur >= 12 && banyakTelur <= 23) {
            diskon = 0.10;
            total = (harga * banyakTelur) * diskon;

            System.out.println("Diskon 10% = " + (int) total);
        } else if (banyakTelur >= 24) {
            diskon = 0.15;
            total = (harga * banyakTelur) * diskon;

            System.out.println("Diskon 15% = " + (int) total);
        } else System.out.println("Diskon 0% = 0");

        System.out.println("Total dibayar = " + (int) (banyakTelur * harga - total));
    }
}
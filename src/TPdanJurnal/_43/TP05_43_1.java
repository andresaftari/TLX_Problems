package TPdanJurnal._43;

import java.util.Scanner;

public class TP05_43_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        String nama3 = scanner.nextLine();

        callname(nama1, nama2, nama3);
    }

    private static void callname(String name1, String name2, String name3) {
        System.out.println("Halo, " + name1 + ". Selamat pagi.");
        System.out.println("Halo, " + name2 + ". Selamat pagi.");
        System.out.println("Halo, " + name3 + ". Selamat pagi.");
    }
}
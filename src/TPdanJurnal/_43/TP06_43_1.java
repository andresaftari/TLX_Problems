package TPdanJurnal._43;

import java.util.Scanner;

public class TP06_43_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        String nama3  = scanner.nextLine();

        setGreeting(nama1);
        setGreeting(nama2);
        setGreeting(nama3);
    }

    private static void setGreeting(String nama) {
        String greeting;
        int index = nama.length() - 1;

        char end = nama.charAt(index);
        switch (end) {
            case 'i' -> greeting = "Semangat pagi!";
            case 'r' -> greeting = "Semangat pintar!";
            default -> greeting = "Semangat ya!";
        }

        System.out.println("Halo, " + nama + ". " + greeting);
    }
}
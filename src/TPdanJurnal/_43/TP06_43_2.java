package TPdanJurnal._43;

import java.util.Scanner;

public class TP06_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        String nama3 = scanner.nextLine();

        setGreeting1(nama1);
        setGreeting1(nama2);
        setGreeting1(nama3);
    }

    // Cara 1
    private static void setGreeting1(String nama) {
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

    // Cara 2
    private static void setGreeting2(String nama) {
        String greeting;

        if (nama.endsWith("i")) greeting = "Semangat pagi!";
        else if (nama.endsWith("r")) greeting = "Semangat pintar!";
        else greeting = "Semangat ya!";

        System.out.println("Halo, " + nama + ". " + greeting);
    }
}
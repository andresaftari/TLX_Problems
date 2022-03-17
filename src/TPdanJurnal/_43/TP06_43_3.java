package TPdanJurnal._43;

import java.util.Scanner;

public class TP06_43_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pesan = scanner.nextLine();

        System.out.println(printText(pesan));
    }

    private static String printText(String pesan) {
        return pesan.replaceAll("[AIUEOaiueo]", "");
    }
}
package TPdanJurnal._43;

import java.util.Scanner;

public class TP02_43_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPermen = scanner.nextInt();
        int totalTeman = scanner.nextInt();

        // Total yang dibagikan
        int pembagian = totalPermen / (totalTeman + 1);
        // Sisa
        int sisa = totalPermen % (totalTeman + 1);
        System.out.println(pembagian + "\n" + sisa);
    }
}
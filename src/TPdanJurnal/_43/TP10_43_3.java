package TPdanJurnal._43;

import java.util.Scanner;

public class TP10_43_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getNotes;
        int jumlah = 0;

        do {
            getNotes = scanner.nextInt();
            jumlah += getNotes;
        }
        while (getNotes != 0);

        System.out.println(jumlah);
    }
}
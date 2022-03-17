package TPdanJurnal._44;

import java.util.Scanner;

public class TP11_44_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int banyakPeserta = scanner.nextInt();
        String[] arrOfPeserta = new String[banyakPeserta];

        for (int i = 0; i < arrOfPeserta.length; i++) {
            String nama = scanner.next();
            arrOfPeserta[i] = nama;
        }

        int randomIndex = (int) (Math.random() * banyakPeserta);
        System.out.println(arrOfPeserta[randomIndex]);
    }
}
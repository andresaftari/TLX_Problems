package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal14_44_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakram = scanner.nextInt();

        tower(cakram, 'A', 'C', 'B');
    }

    private static void tower(int n, char asal, char tujuan, char bantuan) {
        if (n == 1) {
            System.out.println("Cakram " + n + " dipindahkan dari " + asal + " ke " + tujuan);
        } else {
            tower(n - 1, asal, bantuan, tujuan);
            System.out.println("Cakram " + n + " dipindahkan dari " + asal + " ke " + tujuan);
            tower(n - 1, bantuan, tujuan, asal);
        }
    }
}

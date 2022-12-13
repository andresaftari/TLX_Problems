package asprak.ima;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahDisc = sc.nextInt();
        ops(jumlahDisc, "A", "C", "B");
    }

    private static void ops(int n, String start, String dest, String mid) {
        if (n == 1) {
            System.out.println("Disc 1 dari " + start + " ke " + dest);
            return;
        }

        ops(n - 1, start, mid, dest);
        System.out.println("Disc " + n + " dari " + start + " ke " + dest);
        ops(n - 1, mid, dest, start);
    }
}

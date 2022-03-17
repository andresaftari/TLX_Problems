package TPdanJurnal._44;

import java.util.Scanner;

public class TP14_44_2teori_dan3koding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilaiPertama = scanner.nextInt();
        int nilaiKedua = scanner.nextInt();
        int jumlahDeret = scanner.nextInt();

        // Pemanggilan method recursive
        startFibonacci(nilaiPertama, nilaiKedua, jumlahDeret);
    }

    // Recursive method untuk menampilkan Fibonacci
    private static void startFibonacci(int a, int b, int n) {
        /*
         * Base case untuk menentukan apakah nilai pertama (int TPdanJurnal.a) lebih besar dari 0,
         * nilai kedua (int TPdanJurnal.b) lebih besar dari 0, dan jumlah deret (int n) lebih besar dari 0.
         * Artinya apabila int TPdanJurnal.a, TPdanJurnal.b, dan c memiliki nilai 0, program tidak akan dijalankan.
         */
        if (n > 0) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;

            // Update decremental dari jumlah deret ke-N sampai tidak ditemukan deret (n = 0).
            n--;
            // Pemanggilan method itu sendiri, untuk melakukan perulangan perintah.
            startFibonacci(a, b, n);
        }
    }
}
package TPdanJurnal.rifa.adt;

import java.util.Arrays;
import java.util.Scanner;

// Driver class/kelas utama, yang akan menjalankan kodingan
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Resepsi[] arrResepsi;

    public static void main(String[] args) {
        System.out.print("Besar array? [1-10]: ");
        int arrSize = scanner.nextInt();

        arrResepsi = new Resepsi[arrSize];

        // Tambah
        tambahData();

        // Display
        display();
    }

    private static void tambahData() {
        for (int i = 0; i < arrResepsi.length; i++) {
            Resepsi resepsi = new Resepsi(scanner.next(), scanner.next(), scanner.nextInt());
            arrResepsi[i] = resepsi;
        }
    }

    private static void display() {
        Arrays.stream(arrResepsi).forEach(it -> System.out.println(it.toString()));
    }
}
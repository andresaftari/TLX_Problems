package TPdanJurnal.j04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Barang> arrBarang = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        main.add("A015", "Good Day Cappuchino", "kopi", 20);
        main.add("B001", "Sarimurni", "teh", 30);
        main.add("A010", "Good Day Mocchachino", "kopi", 50);

        System.out.print("Kode yang ingin dicari: ");
        String kode = scanner.next();

        main.search(kode);
    }

    private void add(String kode, String nama, String jenis, int stok) {
        arrBarang.add(new Barang(kode, nama, jenis, stok));
    }

    private void search(String kode) {
        for (Barang element : arrBarang) {
            if (kode.equalsIgnoreCase(element.getKode())) {
                System.out.println(element.toString());
            }
        }
    }
}

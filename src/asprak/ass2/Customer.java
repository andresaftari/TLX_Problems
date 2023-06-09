package asprak.ass2;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    int id, tanggalMasuk, berat, finish;
    String nama, tipe;

    public Customer() {
    }

    public Customer(int id, String nama, int tanggalMasuk, String tipe, int berat) {
        this.id = id;
        this.tanggalMasuk = tanggalMasuk;
        this.berat = berat;
        this.nama = nama;
        this.tipe = tipe;

        if (tipe.equalsIgnoreCase("biasa")) finish = 3;
        else if (tipe.equalsIgnoreCase("express")) finish = 2;
        else if (tipe.equalsIgnoreCase("kilat")) finish = 1;
    }

    @Override
    public String toString() {
        return "idCuci = " + id + ", namaPelanggan = " + nama;
    }

    public int getPriority(String tipe) {
        if (tipe.equalsIgnoreCase("biasa")) return 3;
        else if (tipe.equalsIgnoreCase("express")) return 2;
        else if (tipe.equalsIgnoreCase("kilat")) return 1;
        return 0;
    }

    @Override
    public int compareTo(Customer customer) {
        return 0;
    }
}

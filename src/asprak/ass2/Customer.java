package asprak.ass2;

import java.util.Comparator;

public class Customer implements Comparator<Customer> {
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

    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o2.finish, o1.finish);
    }
}
